package lesson0.eolymp;

import java.util.Scanner;

public class Pr10157_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [][] a = new int[n+1][n+1];
        int aa,bb;

        while(in.hasNext()){
            aa = in.nextInt();
            bb = in.nextInt();
            a[aa][bb] = 1;
        }

        for(int k=1; k<=n; k++){
            for(int i=1; i<=n; i++){
                for(int j=1; j<=n; j++){
                    if(a[i][k] == 1 && a[k][j] == 1){
                        a[i][j] = 1;
                    }
                }
            }
        }

        for(int i=1; i<=n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
