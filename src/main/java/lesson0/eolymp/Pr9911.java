package lesson0.eolymp;

import java.util.Scanner;

public class Pr9911 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();

        if(a > b) {
            a = a + b;
            a = a - b;
            b = a - b;
        }
        a = a + a%2;
        b = b - b%2;
        System.out.println((b-a)/2+1);
    }
}
