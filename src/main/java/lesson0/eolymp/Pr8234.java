package lesson0.eolymp;

import java.util.Scanner;

public class Pr8234 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long [] dp = new long[n+1];
        dp[0]=1;
        dp[1]=2;

        for(int i=2; i<=n; i++){
            dp[i] = dp[i-2]*2;
        }
        System.out.println(dp[n]);
    }
}
