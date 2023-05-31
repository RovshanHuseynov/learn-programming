package lesson0.eolymp;

import java.util.Scanner;

public class Pr5856 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int val;
        long sum = 0;
        long max;

        for(int i=0; i<n; i++){
            max = Integer.MIN_VALUE;
            for(int j=0; j<m; j++){
                val = in.nextInt();
                max = Math.max(max, val);
            }
            sum += max;
        }
        System.out.println(sum);
    }
}