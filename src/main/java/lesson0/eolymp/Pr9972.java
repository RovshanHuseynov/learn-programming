package lesson0.eolymp;

import java.util.Scanner;

public class Pr9972 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(n*(n+1)*(2*n+1)/6+n);
    }
}
