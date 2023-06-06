package lesson0.eolymp;

import java.math.BigInteger;
import java.util.Scanner;

public class Pr9975 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        BigInteger sum = new BigInteger("3");
        BigInteger a = new BigInteger("1");
        BigInteger b = new BigInteger("2");
        BigInteger c;
        for(int i=3; i<=n; i++){
            sum = sum.add(a).add(b);
            //System.out.println(a + " " + b + " " + sum);
            c = a.add(b);
            a = b;
            b = c;
        }
        if(n == 1) System.out.println("1");
        else if(n == 2) System.out.println("3");
        else System.out.println(sum);
    }
}
