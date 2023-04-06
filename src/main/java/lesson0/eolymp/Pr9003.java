package lesson0.eolymp;

import java.util.Scanner;

public class Pr9003 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [][] a = new int[201][201];
        for(int i=1; i<=n; i++) {
            for (int j = 1; j <= n; j++) {
                a[i][j] = in.nextInt();
            }
        }

        for(int i=1; i<=n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
