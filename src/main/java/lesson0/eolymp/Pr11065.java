package lesson0.eolymp;

import java.util.Scanner;

public class Pr11065 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();

        if(b >= a) System.out.println(f(a,b));
        else System.out.println(f(a, m) + f(0,b));
    }

    static int f(int from, int to){
        return to - from;
    }
}
