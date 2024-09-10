/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package f24_cis265;

/**
 *
 * @author fiskeremote
 */
public class DemoGeneric <T, E> {
    
    T item;
    E item2;
    
    public DemoGeneric(T val)
    {
        item = val;
    }
    
    public T getVal()
    {
        return(item);
    }
    
    public E getStuff(T val)
    {
        return(item2);
    }
    
}
