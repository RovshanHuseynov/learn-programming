package lesson0.eolymp;

import java.util.Scanner;

public class Pr11408 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int star = 0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            System.out.print("@");
            for(int j=1; j<=star; j++){
                System.out.print("*");
            }
            star+=2;
            if(i==1) star--;
            else System.out.print("@");
            System.out.println();
        }
    }
}
