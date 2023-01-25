package lesson0.eolymp;

import java.util.Scanner;

public class Pr9909 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long temp;

        if(a > b) {
            temp = a;
            a = b;
            b = temp;
        }

        System.out.println(a + " " + b);
        System.out.println((b-a)-1);
    }
}
