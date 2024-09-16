/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package f24_cis265;

/**
 *
 * @author fiske
 */
public class Fraction implements Comparable<Fraction>{
    int num, den;
    public Fraction(int num, int den)
    {
        this.num = num;
        this.den = den;
    }
    
    @Override 
    public String toString()
    {
        return(String.format("(%d / %d)", num, den));
    }

    @Override
    public int compareTo(Fraction other) {
        int diff = num*other.den - other.num*den;
        return(diff);
    }
}