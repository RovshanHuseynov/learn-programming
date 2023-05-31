package lesson0.eolymp;

import java.util.Arrays;
import java.util.Scanner;

public class Pr5855 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int [][] a = new int[n][m];
        long [][] sum = new long[n][m];
        int [][] dp = new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                a[i][j] = in.nextInt();
                sum[i][j] = a[i][j];
            }
        }

        for(int i=1; i<n; i++){
            for(int j=0; j<m; j++){
                long max = sum[i-1][j];
                if(j > 0) max = Math.max(max, sum[i-1][j-1]);
                if(j < m-1) max = Math.max(max, sum[i-1][j+1]);
                sum[i][j] += max;
            }
        }

        /*for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(Arrays.stream(sum[n-1]).max().orElse(0));*/

        long ans = Arrays.stream(sum[n-1]).max().orElse(0);

        for(int j=0; j<m; j++){
            if(sum[n-1][j] == ans){
                dp[n-1][j] = 1;
            }
        }

        for(int i=n-2; i>=0; i--){
            for(int j=m-1; j>=0; j--){
                if(j > 0 && dp[i+1][j-1] > 0 && a[i+1][j-1] + sum[i][j] == sum[i+1][j-1]){ // sol
                    dp[i][j] += dp[i+1][j-1];
                }

                if(dp[i+1][j] > 0 && a[i+1][j] + sum[i][j] == sum[i+1][j]) { // orta
                    dp[i][j] += dp[i+1][j];
                }

                if(j < m-1 && dp[i+1][j+1] > 0 && a[i+1][j+1] + sum[i][j] == sum[i+1][j+1]){ // sag
                    dp[i][j] += dp[i+1][j+1];
                }
            }
        }

        /*for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }*/

        System.out.println(ans + " " + Arrays.stream(dp[0]).sum());
    }
}