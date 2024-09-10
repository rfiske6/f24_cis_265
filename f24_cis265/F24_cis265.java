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
        int x;
        //Integer y = x; //y = new Integer(x);
        //DemoGeneric<String, Integer> alpha;
        //DemoGeneric<Integer, Double> beta;
        //alpha = new DemoGeneric<>();
        //alpha.getVal();
        //beta.getVal();
        //alpha.getStuff(val);
        //beta.getStuff(Integer.SIZE);
             
        SecondGeneric<DemoData> gamma;
        gamma = new SecondGeneric<>();
        
        SecondGeneric<OtherData> omega = new SecondGeneric<>();
        
                
        
        
        
        
        
        
        
        if (true)
        {
            return;
        }
        
        
        String str;
        str = "text";
        String[] strarr;
        strarr = new String[4];
        strarr[0] = "a";
        strarr[1] = "b";
        strarr[2] = "c";
        strarr[3] = "d";
        strarr[2] = "e";
        System.out.printf("string[2] = %s\n", strarr[2]);
        //strarr[4] = "e";
        
        int[] arr = new int[3], arr2;
        arr[0] = 1;
        arr[2] = 2;
        arr[1] = 3;
        arr2 = arr;
        arr = new int[30];
        for (int i = 0; i < arr2.length; i++)
        {
            arr[i] = arr2[i];
        }
        //arr[5] = 4;
        arr2 = new int[4];
        arr = arr2;
        
        int[][] matrix = new int[3][4];
        int[][] multi = new int[3][];
        multi[0] = new int[3];
        multi[1] = new int[30];
        multi[2] = new int[4];
        /*
        ArrayList alInts = new ArrayList();
        alInts.add(1);
        alInts.add(81);
        alInts.add(71);
        alInts.add(11);
        alInts.add("abc");
        int curVal = (int)alInts.get(4);
        */
        
        ArrayList<Integer> alInts = new ArrayList<>();
         alInts.add(10);
        alInts.add(81);
        alInts.add(71);
        alInts.add(11);
        int curVal = alInts.get(0);
        alInts.set(0, 123);  //123, 81, 71, 11
        alInts.add(0, 321);  //321, 123, 81, 71, 11
        alInts.add(2, 456);  //321, 123, 456, 81, 71, 11
        HashMap<String, Integer> tmp = new HashMap<>();
        
        ArrayList<String> alStr = new ArrayList<>();
        
        System.out.printf("retrieved value is: %d\n", curVal);
        
        ArrayList<Person> people = new ArrayList<>();
        TA newTa = new TA();
        people.add(newTa);
        
        ArrayList<Student> students = new ArrayList<>();
        students.add(newTa);
        
        Undergrad newUnder = new Undergrad();
        students.add(newUnder);
        
        Student retrievedData = students.get(0);
        ((TA)retrievedData).getSalary();
        retrievedData = students.get(1);
        ((TA)retrievedData).getSalary();
        
        //Student alpha = new Student();
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
