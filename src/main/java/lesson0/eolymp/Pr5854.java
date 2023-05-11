package lesson0.eolymp;

import java.util.Arrays;
import java.util.Scanner;

public class Pr5854 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        long [][] a = new long[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                a[i][j] = in.nextLong();
            }
        }

        for(int i=1; i<n; i++){
            for(int j=0; j<m; j++){
                long max = a[i-1][j];
                if(j > 0) max = Math.max(max, a[i-1][j-1]);
                if(j < m-1) max = Math.max(max, a[i-1][j+1]);
                a[i][j] += max;
            }
        }

        /*for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }*/

        System.out.println(Arrays.stream(a[n-1]).max().orElse(0));
    }
}