package lesson0.eolymp;

import java.util.Scanner;

public class Pr9980 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j < i) System.out.print(" ");
                else System.out.print("#");
            }
            System.out.println();
        }
    }
}
