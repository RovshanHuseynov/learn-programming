package lesson0.eolymp;

import java.util.Scanner;

public class Pr4053 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int [][] a = new int[n+1][m+1];
        int [][] dp = new int[n+1][m+1];
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                a[i][j] = in.nextInt();
                dp[i][j] = -1;
            }
        }

        dp[1][1] = a[1][1];
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(dp[i][j] != -1 && i+2<=n && j+1<=m) dp[i+2][j+1] = Math.max(dp[i+2][j+1], dp[i][j] + a[i+2][j+1]);
                if(dp[i][j] != -1 && i+1<=n && j+2<=m) dp[i+1][j+2] = Math.max(dp[i+1][j+2], dp[i][j] + a[i+1][j+2]);
            }
        }

        /*for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }*/
        System.out.println(dp[n][m]);
    }
}
/*
6 6
1 2 3 4 5 6
1 2 3 4 5 6
1 2 3 4 5 6
1 2 3 4 5 6
1 2 3 4 5 6
1 2 3 4 5 6
 */
/*
4 2
1 1
1 1
1 1
1 1
 */