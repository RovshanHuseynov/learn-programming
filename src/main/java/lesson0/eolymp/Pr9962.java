package lesson0.eolymp;

import java.util.Scanner;

public class Pr9962 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=i; j<=n; j++){
                for(int k=i; k<=j; k++) {
                    System.out.print(k + " ");
                }
                System.out.println();
            }
        }
    }
}
