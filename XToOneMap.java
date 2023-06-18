/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Application;


import java.util.*;

public class XToOneMap<E,V>{
    
    private final ArrayList<E> objectMap = new ArrayList<>();
    private final ArrayList<V> imageMap = new ArrayList<>();
    
    public void add(E object, V image){
        if(!objectMap.contains(object)){
            objectMap.add(object);
            imageMap.add(image);
        }
    }
    
    public V findImagefromObject(E object){
        if(objectMap.contains(object)){
            return imageMap.get(objectMap.indexOf(object));
        }
        return null;
    }
    
}
