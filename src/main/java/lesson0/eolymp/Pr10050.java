package lesson0.eolymp;

import java.util.Scanner;

public class Pr10050 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a,b,x;
        int [][] arr = new int[n+1][n+1];
        for(int i=0; i<n; i++){
            a = in.nextInt();
            b = in.nextInt();
            x = in.nextInt();
            arr[a][b] = x;
        }
    }
}
