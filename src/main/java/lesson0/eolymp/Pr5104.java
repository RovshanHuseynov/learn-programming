package lesson0.eolymp;

import java.math.BigInteger;
import java.util.Scanner;

public class Pr5104 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        BigInteger[][] a = new BigInteger[n+1][m+1];
        for(int i=1; i<=n; i++){
            a[i][1] = BigInteger.ONE;
        }
        for(int i=1; i<=m; i++){
            a[1][i] = BigInteger.ONE;
        }
        for(int i=2; i<=n; i++){
            for(int j=2; j<=m; j++){
                a[i][j] = a[i-1][j].add(a[i][j-1]);
            }
        }

        /*for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }*/

        System.out.println(a[n][m]);
    }
}
