package lesson0.eolymp;

import java.util.Scanner;

public class Pr10275 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if(a + b == c || a + c == b || b + c == a) System.out.println("Yes");
        else System.out.println("No");
    }
}
