package lesson0.eolymp;

import java.util.Scanner;

public class Pr11442 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n = in.nextDouble();
        double x = in.nextDouble();
        System.out.printf("%.6f\n" , ((Math.pow(Math.sin(x),n+1)-1)/(Math.sin(x)-1))-1);
    }
}
