package lesson0.eolymp;

import java.util.Scanner;

public class Pr9646 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long m = in.nextLong();
        long ans = 0;
        for(int i=1; i<=n; i++){
            ans += Math.pow(i,i);
        }
        System.out.println(ans%m);
    }
}
