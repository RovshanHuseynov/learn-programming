package lesson0.eolymp;

import java.util.Scanner;

public class Pr9969 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long last = 1L;
        for(int i=1; i<=n; i++){
            last *= i;
            System.out.print(last + " ");
        }
    }
}
