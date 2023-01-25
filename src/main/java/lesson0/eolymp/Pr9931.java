package lesson0.eolymp;

import java.util.Scanner;

public class Pr9931 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int h = m / 60;
        System.out.println(h + " " + (m-h*60));
    }
}
