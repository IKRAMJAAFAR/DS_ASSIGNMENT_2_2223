/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Application;

import java.util.*;

public class Sorting<T>{
    
    private Comparator<T> comparator;

    public Sorting(){
        
    }
    
    public void sort(T[] array, boolean ascend,Comparator<T> comparator){
        this.comparator = comparator;
        sort(array,0,array.length - 1,ascend,comparator);
        
    }
    
    public void sort(T[] array,int min,int max, boolean ascend, Comparator<T> comparator){
        this.comparator = comparator;
        if(min < max){
            Integer pivotInd = getPivot(array, min,max, ascend);
            sort(array,min,pivotInd - 1,ascend,comparator);
            sort(array,pivotInd + 1,max,ascend,comparator);
        }
    }
    
    public Integer getPivot(T[] array,int min,int max, boolean ascend){
        Random rand = new Random();
        Integer index = rand.nextInt(max - min + 1) + min;
        swap(array,index,max);
        return partition(array,min,max,ascend);
    }
    
    public Integer partition(T[] array,int min,int max, boolean ascend){
        T pivot = array[max];
        int det = min - 1;
        
        for(int i = min;i < max;i++){
            Integer compare = compareTo(array[i],pivot);
            if((ascend && compare <= 0) || (!ascend && compare >= 0)){
                det++;
                swap(array,det,i);
            }
        }
        
        swap(array,det + 1,max);
        return det+1;
        
    }

    public void swap(T[] array,int i,int j){
        T hold = array[i];
        array[i] = array[j];
        array[j] = hold;
    }

    public int compareTo(T element, T pivot) {
        return comparator.compare(element, pivot);
    }

}