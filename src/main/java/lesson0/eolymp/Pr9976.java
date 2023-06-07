package lesson0.eolymp;

import java.util.Scanner;

public class Pr9976 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double sum = 0.0;
        int a = 1;
        int b = 1;
        for(int i=1; i<=n; i++){
            sum += 1.0*a/b;
            a++;
            b+=2;
        }
        System.out.printf("%.3f\n",sum);
    }
}
