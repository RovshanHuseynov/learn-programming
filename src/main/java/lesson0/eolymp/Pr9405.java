package lesson0.eolymp;

import java.util.Scanner;

public class Pr9405 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int R = n-a;
        int Y = n-b;
        int B = n-R-Y;
        System.out.println(B + " " + R + " " + Y);
    }
}
