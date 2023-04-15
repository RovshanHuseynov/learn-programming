package lesson0.eolymp;

import java.math.BigInteger;
import java.util.Scanner;

public class Pr9646 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        BigInteger ans = BigInteger.ZERO;
        for(int i=1; i<=n; i++){
            ans = ans.add(pow(BigInteger.valueOf(i),BigInteger.valueOf(i)));
        }
        System.out.println(ans.mod(BigInteger.valueOf(m)));
    }

    static BigInteger pow(BigInteger n, BigInteger power){
        if(power.equals(BigInteger.ONE)) return n;

        if(power.mod(BigInteger.TWO).equals(BigInteger.ZERO)){
            return pow(n, power.divide(BigInteger.TWO)).multiply(pow(n, power.divide(BigInteger.TWO)));
        } else {
            return pow(n, power.divide(BigInteger.TWO)).multiply(pow(n, power.divide(BigInteger.TWO))).multiply(n);
        }
    }
}
