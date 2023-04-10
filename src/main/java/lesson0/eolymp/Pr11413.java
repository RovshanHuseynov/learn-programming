package lesson0.eolymp;

import java.util.Scanner;

public class Pr11413 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i % 2 == 1) System.out.print("\\");
                else System.out.print("/");
            }
            System.out.println();
        }
    }
}
