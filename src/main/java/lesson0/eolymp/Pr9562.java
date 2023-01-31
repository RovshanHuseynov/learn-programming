package lesson0.eolymp;

import java.util.Scanner;

public class Pr9562 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int [][] arr = new int[n+1][m+1];
        int sum = 0;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                arr[i][j] = in.nextInt();
            }
        }

        int r1 = in.nextInt();
        int c1 = in.nextInt();
        int r2 = in.nextInt();
        int c2 = in.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(i>=r1 && j>=c1)
                    if(i<=r2 && j<=c2) sum += arr[i][j];
            }
        }

        System.out.println(sum);
    }
}
