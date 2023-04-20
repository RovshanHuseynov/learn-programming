package lesson0.eolymp;

import java.util.Scanner;

public class Pr11443 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n = in.nextDouble();
        double x = in.nextDouble();
        double sum = 0F;

        for(double i=1; i<=n; i++){
            if(x<0 && i%2==1)
                sum += Math.sin(-1 * Math.pow(x,i));
            else
                sum += Math.sin(Math.pow(x,i));
        }
        System.out.printf("%.6f\n",sum);
    }
}
