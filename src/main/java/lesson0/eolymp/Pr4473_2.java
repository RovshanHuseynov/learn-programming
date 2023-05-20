package lesson0.eolymp;

import java.util.Arrays;
import java.util.Scanner;

public class Pr4473_2 {
    static int[] a;
    static int[] sum;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        a = new int[n+1];
        sum = new int[n+1];
        int max = Integer.MIN_VALUE;
        for(int i=1; i<=n; i++){
            a[i] = in.nextInt();
            max = Math.max(max, a[i]);
            sum[i] = max;
        }
        System.out.println(Arrays.toString(sum));

        int x,y;
        int m = in.nextInt();
        for(int i=0; i<m; i++){
            x = in.nextInt();
            y = in.nextInt();

            if(x > y){
                x = x + y;
                y = x - y;
                x = x - y;
            }
        }
    }
}
