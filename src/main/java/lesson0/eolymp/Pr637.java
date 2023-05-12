package lesson0.eolymp;

import java.math.BigInteger;
import java.util.Scanner;

public class Pr637 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        BigInteger ans = BigInteger.ONE;
        for(int i=1; i<=n*n; i++){
            ans = ans.multiply(new BigInteger("2"));
        }
        System.out.println(ans.subtract(BigInteger.ONE));
    }
}