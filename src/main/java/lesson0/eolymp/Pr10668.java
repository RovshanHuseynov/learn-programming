package lesson0.eolymp;

import java.math.BigInteger;
import java.util.Scanner;

public class Pr10668 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long m = in.nextLong();
        System.out.println(fac(n+m).divide(fac(n)).divide(fac(m)));
    }

    private static BigInteger fac(long n){
        BigInteger ans = BigInteger.ONE;
        for(long i=2; i<=n; i++){
            ans = ans.multiply(BigInteger.valueOf(i));
        }
        return ans;
    }
}
