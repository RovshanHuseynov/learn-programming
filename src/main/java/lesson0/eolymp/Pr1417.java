package lesson0.eolymp;

import java.util.Scanner;

public class Pr1417 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long m = in.nextLong();
        long n = in.nextLong();
        long x = in.nextLong();
        long y = in.nextLong();
        long sum = 2;
        sum += n; //System.out.println(sum);
        sum += (m-1); //System.out.println(sum);
        sum += Math.min(x,y)-1; //System.out.println(sum);
        sum += Math.min(m-x,y)-1; //System.out.println(sum);
        sum += Math.min(x,n-y)-1; //System.out.println(sum);
        sum += Math.min(m-x,n-y)-1; System.out.println(sum);
    }
}
