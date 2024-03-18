package BT5;

public class BT5 {
    public static void main(String[] args) {
        System.out.print("Fraction - Fraction Array - To Vinh Tien - 22521474.");
        FractionArray fractionArray = new FractionArray();
     
        System.out.print("\nEnter the array of fractions:");
        fractionArray.Input();
        
        System.out.print("\nThe fraction array will include the following elements:");
        fractionArray.Output();
        System.out.print(".");
        
        System.out.print("\n\nThe fraction array after sorting in ascending order:");
        fractionArray.AscSort();
        fractionArray.Output();
        System.out.print(".");
        
        System.out.print("\nThe fraction array after sorting in descending order:");
        fractionArray.DescSort();
        fractionArray.Output();
        System.out.print(".");
        
        System.out.print("\n\nThe largest fraction in the array is: ");
        Fraction max = (Fraction)fractionArray.MaxFrac();
        max.Output();
        System.out.print(".");
        
        System.out.print("\nThe smallest fraction in the array is: ");
        Fraction min = (Fraction)fractionArray.MinFrac();
        min.Output();
        System.out.print(".");
        System.out.println();
    }
    
}
