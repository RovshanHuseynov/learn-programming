package lesson0.eolymp;

import java.util.Arrays;
import java.util.Scanner;

public class Pr9715 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    }
}

abstract class Arr9715 {
    int a[];
    int n;
    abstract int Min();
    abstract int Max();
}

class Array9715 extends Arr9715 {
    Array9715(int n){
        a = new int[n];
    }

    public int Min(){
        return Arrays.stream(a).min().orElse(0);
    }

    public int Max(){
        return Arrays.stream(a).max().orElse(0);
    }
}