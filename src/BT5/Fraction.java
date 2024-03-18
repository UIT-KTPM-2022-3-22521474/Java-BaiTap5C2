package BT5;

import java.util.Scanner;

public class Fraction implements Comparable {
    private int numerator;
    private int denominator;
    
    Fraction(){
        numerator = 0;
        denominator = 1;
    }
    
    Fraction(int tu){
        numerator = tu;
        denominator = 1;
    }
    
    Fraction(int tu, int mau){
        numerator = tu;
        denominator = mau;
    }
    
    Fraction(Fraction a){
        numerator = a.numerator;
        denominator = a.denominator;
    }
    
    public int getNumerator(){
        return numerator;
    }
    
    public int getDenominator(){
        return denominator;
    }
    
    public void setNumerator(int nume){
        numerator = nume;
    }
    
    public void setDenominator(int deno){
        denominator = deno;
    }

    public void Input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the numerator: ");
        numerator = scanner.nextInt();
        System.out.print("Enter the denominator: ");
        denominator = scanner.nextInt();
        while(denominator == 0) {
            System.out.print("Denominator cannot be zero. Please enter a non-zero denominator: ");
            denominator = scanner.nextInt();
        }
    }
    
    public void Output(){
        System.out.print(numerator + "/" + denominator);
    }
    
    @Override
    public int compare(Object fraction) {
        Fraction a = (Fraction) fraction;
        double tempB = (double)a.numerator / a.denominator;
        double tempA = (double) numerator / denominator;
        return Double.compare(tempA, tempB);
    }
}
