/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Application;


import java.util.*;

public final class RCTransCipher{
    
    public static void main(String[] args) {
        RCTransCipher alg = new RCTransCipher();
        String test = "Hello World! Program is Working?";
        System.out.println("PlainText: " + test);
        System.out.println("CipherText: " + alg.encrpyt(test));
        String result = alg.decrpyt(alg.encrpyt("Hello World! Program is Working?"));
        System.out.println("Success: " + test.equals(result));
    }
    
    private final Integer ITERATION_COUNT = 9;
    private final String KEYWORD = "QuZaB";
    private final Integer FIXED_LENGTH = KEYWORD.length();
    private final Character PAD = '_';
    
    RCTransCipher() {
        // Private constructor to prevent instantiation
    }
    
    private Integer[] change() {
        Integer[] sorted = new Integer[FIXED_LENGTH];
        Integer[] result = new Integer[FIXED_LENGTH];
        XToOneMap<Integer,Integer> map = new XToOneMap<>();
        Sorting<Integer> sorting = new Sorting<>();
        Comparator<Integer> comparator = Comparator.naturalOrder();
        
        for(int i = 0;i < FIXED_LENGTH;i++){
            Character c = KEYWORD.charAt(i);
            c = Character.toLowerCase(c);
            sorted[i] = (Integer) (c - 'a');
            result[i] = (Integer) (c - 'a');
        }
        sorting.sort(sorted, true, comparator);
        
        
        for(int i = 0;i < FIXED_LENGTH;i++){
            map.add(sorted[i], i);
        }
        
        for(int i = 0;i < FIXED_LENGTH;i++){
            result[i] = map.findImagefromObject(result[i]);
        }
        
        return result;
    }

    protected String encrpyt(String text) {
        for(int repeat = 1;repeat <= ITERATION_COUNT;repeat++){
            String result = "";
            int row = (int) (Math.floor((float)(text.length())/FIXED_LENGTH));
            for(Integer k:change()){
                Integer i = k;
                String hold = "";
                while(true){
                    if(i >= text.length()){
                        result = result + hold;
                        if(hold.length() == row && text.length()%FIXED_LENGTH != 0){
                            result += PAD;
                        }
                        break;
                    }
                    hold = hold + text.charAt(i);
                    i += FIXED_LENGTH;
                }
            }
            text = result;
        }
        return text;
    }
    
    protected String decrpyt(String text) {
        for(int repeat = 1;repeat <= ITERATION_COUNT;repeat++){
            String result = "";
            int row = (int) (Math.ceil((float)(text.length())/FIXED_LENGTH));
            for(int i = 0;i < row;i++){
                Character[] temp = new Character[FIXED_LENGTH];
                int k = i;
                for(int j = 0;j < FIXED_LENGTH;j++){
                    temp[j] = text.charAt(k);
                    k += row;
                }
                
                Integer[] t = new Integer[change().length];
                System.arraycopy(change(), 0, t, 0, change().length);
                for(int a = 0;a < t.length - 1;a++){
                    for(int j = a + 1;j <t.length;j++){
                        if(t[a] > t[j]){
                            Character hold = temp[a];
                            temp[a] = temp[j];
                            temp[j] = hold;
                            Integer test = t[a];
                            t[a] = t[j];
                            t[j] = test;
                        }
                    }
                }
                
                for(Character q:temp){
                    result = result + q;
                }
                
            }
            text = result;
        }
        
        
        if(text.contains(String.valueOf(PAD))){
            for(int i = text.length() - 1;i > text.length() - FIXED_LENGTH;i--){
                if(text.charAt(i) == PAD && text.charAt(i - 1) != PAD){
                    text = text.substring(0,i);
                }
            }
        }
        return text;
    }
}
