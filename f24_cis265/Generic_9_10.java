/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package f24_cis265;

/**
 *
 * @author fiskeremote
 */
public class Generic_9_10 <T> {
    /*
    create generic class
    this class will be an array list
    so for now:
    create a private array to hold T values
    and create a constructor to initialize that array
    */
    private T[] values;
    private int count = 0;
    public Generic_9_10()
    {
        values = (T[])new Object[4];
    }
    
    public void add(T val)
    {
        if (count >= values.length)
        {
            T[] tmp = (T[])new Object[count*2];
            for(int i = 0; i < values.length; i++)
            {
                tmp[i] = values[i];
            }
            values = tmp;
        }
        
        values[count++] = val;
    }
    
    public T get(int index)
    {
        return(values[index]);
    }
    
    //add an add method that takes a parameter T and adds it to our storage
    //add a get method that tages an integer index and retrieves the 
    //value at the index provided (don't worry about error checking for now
}
