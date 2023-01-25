package lesson0.eolymp;

import java.util.Scanner;

public class Pr9564 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int rowSum,max=-1000;
        int [] sum = new int[n+1];

        for(int i=1; i<=n; i++){
            rowSum = 0;
            for(int j=1; j<=m; j++){
                rowSum += in.nextInt();
            }
            sum[i] = rowSum;
            max = Math.max(max, rowSum);
        }

        for(int i=1; i<=n; i++){
            if(sum[i] == max) System.out.print(i+" ");
        }
    }
}
