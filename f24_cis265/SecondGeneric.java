/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package f24_cis265;

import java.util.List;

/**
 *
 * @author fiskeremote
 * @param <T>
 */
public class SecondGeneric <T extends CalculatesData &
        List & Comparable>{
    //exclude/include primitive types generic, multiple bounds
    T item; 
    CalculatesData[] values;
    
    public SecondGeneric()
    {
        //item = (T)new CalculatesData();
        values = new CalculatesData[10];
    }
    
    public void someMethod()
    {
        
        values[9] = null;
        item.calcResult();
    }
}
