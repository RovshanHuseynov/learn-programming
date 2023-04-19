package lesson0.eolymp;

import java.util.Scanner;

public class Pr11435 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double ans = 1;

        for(double i=1; i<=n; i++){
            ans *= (i*i+1)/(i*i);
        }

        System.out.printf("%.6f\n",ans);
    }
}
