package lesson0.eolymp;

import java.util.Scanner;

public class Pr9984 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++) System.out.print(j);
            for(int j=0; j<i; j++) System.out.print(j);
            System.out.println();
        }
    }
}
