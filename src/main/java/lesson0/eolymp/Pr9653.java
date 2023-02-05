package lesson0.eolymp;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Pr9653 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = Double.parseDouble(in.nextLine());
        double b = Double.parseDouble(in.nextLine());
        double ans  = (a * b + 10) / 3 + (a + 2 / b - 7) * 5 - a - b / a;
        System.out.println(BigDecimal.valueOf(ans).setScale(5, RoundingMode.HALF_UP).doubleValue());
    }
}
