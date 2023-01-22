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
        if(a % 2 != 0) a++;
        if(b % 2 != 0) b--;
        System.out.println((b-a)/2+1);
    }
}
