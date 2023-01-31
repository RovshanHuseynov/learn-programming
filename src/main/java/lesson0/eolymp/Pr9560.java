package lesson0.eolymp;

import java.util.Scanner;

public class Pr9560 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        for(int i=0; i<n; i++){
            for(int j=0; j<m-1; j++)
                System.out.print(in.nextInt() + " ");
            System.out.println(in.nextInt());
        }
    }
}
