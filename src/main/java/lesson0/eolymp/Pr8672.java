package lesson0.eolymp;

import java.util.Scanner;

public class Pr8672 {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        double x  = con.nextDouble();
        double y = Math.sqrt(x);
        System.out.printf("%6f\n",y);
        con.close();
    }
}
