package lesson0.eolymp;

import java.util.Scanner;

public class Pr8234 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long [] dp = new long[61];
        dp[0]=1;
        dp[1]=1;
        dp[2]=2;

        for(int i=3; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }
        System.out.println(dp[n]);
    }
}
