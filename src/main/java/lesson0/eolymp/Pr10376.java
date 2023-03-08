package lesson0.eolymp;

import java.util.Scanner;

public class Pr10376 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int min = 1;
        int max = 6;
        int range = max - min + 1;

        for(int i=1; i<=n; i++){
            System.out.print(((int)(Math.random() * range) + min) + " ");
        }
        System.out.println();
    }
}
