package lesson0.eolymp;

import java.util.Scanner;

public class Pr11409 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j==1 || i==j) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=n+1; i<=2*n-1; i++){
            for(int j=1; j<=n; j++){
                if(j==1 || i+j==2*n) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
