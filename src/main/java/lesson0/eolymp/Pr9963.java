package lesson0.eolymp;

import java.util.Scanner;

public class Pr9963 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();
        System.out.printf("%.2f\n",Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)));
    }
}
