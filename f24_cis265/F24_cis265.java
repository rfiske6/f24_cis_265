/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package f24_cis265;

import java.util.ArrayList;
import java.util.HashMap;

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
    
    void run()
    {
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
    
}
