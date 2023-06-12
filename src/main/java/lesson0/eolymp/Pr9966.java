package lesson0.eolymp;

import java.util.Scanner;

public class Pr9966 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(long i=1L; i<=n; i++){
            System.out.print(i*i + " ");
        }
    }
}
