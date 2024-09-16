/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package f24_cis265;

/**
 *
 * @author fiskeremote
 */
public class Generic_9_10 <T extends Comparable> {
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
        values = (T[])new Comparable[4];
    }
    
    private boolean isValidIndex(int index)
    {
        if (index >= 0 && index < count)
        {
            return(true);
        }
        else
        {
            return(false);
        }
    }
    
    public void set(int index, T val)
    {
        //if(!isValidIndex(index))
        if (isValidIndex(index) == false)
        {
          throw new IndexOutOfBoundsException();  
        }
        values[index] = val;
    }
    
    
    public void add(int index, T val)
    {
        count++;
        for(int i = count; i > index; i--)
        {
            values[i] = values[i-1];
        }
        values[index] = val;
    }
    
    public void add(T val)
    {
        if (count >= values.length)
        {
            T[] tmp = (T[])new Comparable[count*2];
            for(int i = 0; i < values.length; i++)
            {
                tmp[i] = values[i];
            }
            values = tmp;
        }
        
        values[count++] = val;
    }
    
    public void remove(int index)
    {
        count--;
        for(int i = index; i < count; i++)
        {
            values[i] = values[i+1];
        }
        values[count] = null;
    }
    
    public void remove(T val)
    {
        for (int i = 0; i < count; i++)
        {
            if (val.compareTo(values[i]) == 0)
            {
                remove(i);
            }
        }
    }
    
    public T get(int index)
    {
        if (index >= count || index < 0)
        {
            throw new IndexOutOfBoundsException();
        }   
        return(values[index]);
    }
    
    @Override
    public String toString()
    {
        StringBuilder bld = new StringBuilder();
        bld.append("[");
        for (int i = 0; i < count; i++)
        {
            bld.append(values[i]);
            bld.append(", ");
        }
        bld.setLength(bld.length()-2);
        bld.append("]");
        return(bld.toString());
    }
    
}
