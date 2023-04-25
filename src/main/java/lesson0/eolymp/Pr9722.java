package lesson0.eolymp;

import java.util.Scanner;

public class Pr9722 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b;

        while(in.hasNext()) {
            a = in.nextInt();
            b = in.nextInt();

            try {
                System.out.println(a / b);
            } catch (Exception e) {
                System.out.println("Division by zero");
            }
        }
    }
}
