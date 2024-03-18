package BT5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class FractionArray implements Sortable {
    private int N;
    private Fraction[] arr;
    
    FractionArray(){
        N = 0;
    }
    
    FractionArray(int n, Fraction[] a){
        N = n;
        arr = a;
    }
    
    public void Input(){
        System.out.print("\nEnter the number of fractions: ");
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        arr = new Fraction[N];
        for (int i = 0; i < N; i++){
            arr[i] = new Fraction();
            System.out.println("\nEnter the " + getOrdinal(i + 1) + " fraction: ");
            arr[i].Input();
        }
    }
    
    public void Output(){
        for (int i = 0; i < N; i++){
            System.out.print(" ");
            arr[i].Output();
        }
    }

    private static String getOrdinal(int number) {
        int remainder10 = number % 10;
        int remainder100 = number % 100;
        if (remainder10 == 1 && remainder100 != 11) {
            return number + "st";
        } else if (remainder10 == 2 && remainder100 != 12) {
            return number + "nd";
        } else if (remainder10 == 3 && remainder100 != 13) {
            return number + "rd";
        } else {
            return number + "th";
        }
    }
    
    @Override
    public void AscSort(){
        Arrays.sort(arr, new Comparator<>() {
            @Override
            public int compare(Fraction ps1, Fraction ps2) {
                return ps1.compare(ps2);
            }
        });
    }
    
    @Override
    public void DescSort(){
        Arrays.sort(arr, new Comparator<>() {
            @Override
            public int compare(Fraction ps1, Fraction ps2) {
                return ps2.compare(ps1);
            }
        });
    }
    
    @Override
    public Object MaxFrac(){
        Fraction max;
        max = arr[0];
        for (int i = 0; i < N; i++)
            if (arr[i].compare(max) == 1)
                max = arr[i];
        return max;
    }
    
    @Override
    public Object MinFrac(){
        Fraction min;
        min = arr[0];
        for (int i = 0; i < N; i++)
            if (arr[i].compare(min) == -1)
                min = arr[i];
        return min;
    }
}
