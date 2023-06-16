package lesson0.eolymp;

import java.util.Scanner;

public class Pr2585 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int val;
        long max = -1000;
        long [] sum = new long[n+1];
        for(int i=1; i<=n; i++){
            val = in.nextInt();
            if(val > max) max = val;
            sum[i] = sum[i-1] + val;
        }

        int i=1, j=n, maxI=1, maxJ=n;
        while(i<=n){
            if(sum[j]-sum[i] > max){
                max = sum[j]-sum[i];
                maxI = i;
            }
            i++;
        }

        while(j>=maxI){
            if(sum[j]-sum[maxI] > max){
                max = sum[j]-sum[maxI];
                //maxJ = j;
            }
            j--;
        }
        System.out.println(max);
    }
}
