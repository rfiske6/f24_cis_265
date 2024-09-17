/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package f24_cis265;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author fiskeremote
 */
public class F24_cis265 {

    /**
     * @param args the command line arguments
     */
    
    F24_cis265()
    {
        
    }
    
    Random rand = new Random(24);
    public void runawayRecursion(int count)
    {
        System.out.printf("In runaway %d\n", count);
        if (rand.nextBoolean())
        {
            runawayRecursion(count);
        }
        else if (count < 4)
        {
            runawayRecursion(count + 1);
        }
    }
    
    void run()
    {
        runawayRecursion(1);
        Generic_9_10<Integer> alpha = new Generic_9_10<>();
        Generic_9_10<String> beta = new Generic_9_10<>();
        NonGeneric_9_10 gamma = new NonGeneric_9_10();
        alpha.add(1);
        System.out.println("alpha: " + alpha.get(0));
        beta.add("abc");
        System.out.print("beta: " + beta.get(0) + "\n");
        gamma.add(1);
        gamma.add("abc");
        //System.out.printf("gamma(0): %d\tgamma(1): %d\n", gamma.get(0),
        //        gamma.get(1));
        System.out.print("gamma(0): " + gamma.get(0) + "\tgamma(1): " +
                gamma.get(1) + "\n");
        int x = (Integer)gamma.get(0);
        //int y = (Integer)gamma.get(1);
        x = alpha.get(0);
        alpha.add(1);
        alpha.add(2);
        alpha.add(3);
        alpha.add(4);
        
        Generic_9_10<Integer> demo = new Generic_9_10();
        demo.add(5);
        demo.add(2354);
        demo.add(5);
        demo.add(10);
        demo.add(123);
        demo.remove((Integer)5);
        
        Generic_9_10<String> demo2 = new Generic_9_10();
        demo2.add("abc");
        demo2.add("def");
        Scanner input = new Scanner(System.in);
        String val = input.next();
        demo2.remove(val);
    
        //y = 5
        //then arr[4] = 5;
        //when arr = 1
        //arr[0] = 1
        return;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        F24_cis265 alpha = new F24_cis265();
        alpha.run();
    }
    
    class Person
    {
        public String name;
    }
    
    interface Student
    {
        public double getGPA();
    }
    
    interface Employee
    {
        public int getSalary();
    }
    
    class TA extends Person implements Student, Employee
    {

        @Override
        public double getGPA() {
            return(0);
        }

        @Override
        public int getSalary() {
            return(0);
        }
        
    }
    
    class Undergrad implements Student
    {

        @Override
        public double getGPA() {
            return(0);
        }
        
    }
    
    public int binarySearchRecursive(int[] data, int val,
            int low, int high)
    {
        if (low > high)
        {
            return(-1);
        }
        int mid = (low + high)/2;
        if (val == data[mid])
        {
            return(mid);
        }
        else if (val < data[mid])
        {
            //move high to mid - 1
            return(binarySearchRecursive(data, val, low, mid-1));
        }
        else
        {
            //move low to mid+1
            return(binarySearchRecursive(data, val, mid+1, high));
        }
    }
    
    public int binarySearchIterative(int[] data, int val)
    {
        int high, low, mid;
        high = data.length-1;
        low = 0;
        while (low <= high)
        {
            mid = (low + high) / 2;
            if (val == data[mid])
            {
                return(mid);
            }
            else if (val < data[mid])
            {
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }
        return(-1);
    }
    
}
