package lesson0.eolymp;

import java.util.Scanner;

public class Pr9982 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}