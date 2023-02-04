package lesson0.eolymp;

import java.util.Scanner;

public class Pr10668 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long m = in.nextLong();
        System.out.println(fac(n+m)/fac(n)/fac(m));
    }

    private static long fac(long n){
        long ans = 1L;
        for(long i=2; i<=n; i++){
            ans *= i;
        }
        return ans;
    }
}
