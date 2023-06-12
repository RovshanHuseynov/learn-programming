package lesson0.eolymp;

import java.util.Scanner;

public class Pr9965 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=1; i<=2*n; i+=2){
            System.out.print(i + " ");
        }
    }
}
