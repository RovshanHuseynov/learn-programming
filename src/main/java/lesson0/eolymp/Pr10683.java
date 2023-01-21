package lesson0.eolymp;

import java.util.Scanner;

public class Pr10683 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        System.out.println(n*(n+1)*n*(n+1)/4);
    }
}