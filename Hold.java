/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Application;

import DAY_18_6_AT_HOUR_14_20.*;

public class Hold<E> {
    private final E element;
    private final int distance;

    public Hold(E element, int distance) {
        this.element = element;
        this.distance = distance;
    }
    
    public E getElement(){
        return element;
    }
    
    public int getDistance(){
        return distance;
    }
}
