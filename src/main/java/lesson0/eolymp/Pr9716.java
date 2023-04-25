package lesson0.eolymp;

import java.util.Arrays;
import java.util.Scanner;

public class Pr9716 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = in.nextInt();
        }

        Arr9716 test = new Array9716(n);
        test.a = a;
        System.out.println(test.Sum());
        System.out.println(test.Average());
    }
}

abstract class Arr9716 {
    int[] a;
    int n;
    abstract int Sum();
    abstract double Average();
}

class Array9716 extends Arr9716 {
    public Array9716(int n) {
        super.n = n;
        super.a = new int[n];
    }
    int Sum(){ return Arrays.stream(super.a).sum();}
    double Average(){return Arrays.stream(super.a).average().orElse(0.0);}
}
