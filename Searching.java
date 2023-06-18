/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Application;

import DAY_18_6_AT_HOUR_14_20.*;
import java.util.*;

/**
 * Fuzzy Search - Luv
 * Binary Search
 *
 * @author weare
 * @param <E>
 */
public class Searching<E>{
    
    
    Comparator<E> comparator;
    private final Integer THRESHOLD = 2;
    private List<E> list;
    private final PriorityQueue<Hold> queue = new PriorityQueue<>(Comparator.comparingInt(Hold::getDistance));
    
    public static void main(String[] args) {
        
        String[] name = {"Ali Hensem","Abu Cai","Rabu Halal","Khamis Chong","Gempak Rabu","Tanam Bayi","Encik Nakal","Kakak Buaya","Naughty Granny","Tajuk Hang","Hamba Allah","Encik Miskin","Karam Kapal","Bintang Seri","Budak Senyap","Bahaya Royal","Kualiti Air","Rambut Kering","Anjing Gila","Saya Cinta","Maaf Saya","Tuju Hala","Kerusi Halal","Anjing Sunyi","Banyak Nama","Dia Robot","Hujan Panas","Roda Babi","Banyak Sampah","Kurang Ajar","Mak Kerja"};
        String[] firstName = new String[name.length];
        String[] lastName = new String[name.length];
        String[][] naming = {firstName,lastName};
        
        for(int i = 0;i < firstName.length;i++){
            String[] t = name[i].split(" ");
            firstName[i] = t[0];
            lastName[i] = t[1];
        }
        
        Searching<String> search = new Searching<>();
        String target = "Maf";
        Comparator<String> comparator = Comparator.naturalOrder();
        System.out.println("TARGET: " + target);
        System.out.println("");
        
        for(String[] s:naming){
            search.find(s, target, comparator);
            search.printList();
        }
        
    }
    
    
    Searching(){
        
    }
    
    private int lev(String a,String b){
        if(b.length() == 0){
            return a.length();
        }
        else if(a.length() == 0){
            return b.length();
        }
        else if(a.charAt(0) == b.charAt(0)){
            return this.lev(a.substring(1), b.substring(1));
        }
        else{
            int delete = lev(a.substring(1),b);
            int insert = lev(a,b.substring(1));
            int subtitute = lev(a.substring(1),b.substring(1));
            int min = Math.min(delete, subtitute);
            min = Math.min(insert, min);
            return 1 + min;
        }
    }
    
    public void printList(){
        System.out.println("RESULT");
        while(!queue.isEmpty()){
            Hold<E> hold = queue.poll();
            System.out.println(hold.getElement() + " - " + hold.getDistance());
        }
    }
    
    
    
    protected boolean find(E[] array,E element,Comparator<E> comparator){
        this.comparator = comparator;
        list = new ArrayList<>();
        
        
        if(array == null || array.length == 0)
            return false;
        
        
        if(!BinarySearch(array, element))
            LinearSearch(array,element);
        
        
        return !list.isEmpty();
    }
    
    
    protected void LinearSearch(E[] array,E element){
        
        for(E el:array){
            check(el,element);
        }

    }
    
    protected boolean BinarySearch(E[] array,E element){
        Sorting<E> sorting = new Sorting<>(); 
        E[] temp = array;
        sorting.sort(temp, true, comparator);
        
        
        int min = 0;
        int max = array.length - 1;
        int middle;
        
        while(min <= max){
            middle = (min + max) / 2;
            E get = temp[middle];
            
            int compare = compareTo(get,element);
            check(get,element);
            
            if(compare == 0){
                return true;
            }
            else if(compare < 0){
                max = middle - 1;
            }
            else{
                min = middle + 1;
            }
            
        }
        return false;

    }

    private int compareTo(E element,E target) {
        return comparator.compare(element, target);
    }
    
    public void check(E element,E target){
        if(calculate(element,target)){
            Hold<E> hold = new Hold(element,cal(element,target));
            queue.offer(hold);
        }
    }
    
    public boolean calculate(E element, E target){
        return cal(element,target) <= THRESHOLD;
    }
    
    public int cal(E element, E target){
        return lev(element.toString(),target.toString());
    }
    
   
    
}
