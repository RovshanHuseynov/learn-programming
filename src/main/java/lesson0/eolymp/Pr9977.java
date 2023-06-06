package lesson0.eolymp;

import java.util.Scanner;

public class Pr9977 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double sum = 0.0;
        for(int i=1; i<=2*n; i+=2){
            sum += 1.0*i/(i+1);
        }
        System.out.printf("%.3f\n",sum);
    }
}
