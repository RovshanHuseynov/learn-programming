package lesson0.eolymp;

import java.util.Scanner;

public class Pr11411 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<i; j++){
                System.out.print("|");
            }
            System.out.print("@");
            for(int j=1; j<=2*n-1-2-2*(i-1); j++){
                System.out.print(" ");
            }
            if(i!=n) System.out.print("@");
            for(int j=1; j<i; j++){
                System.out.print("|");
            }
            System.out.println();
        }
    }
}
