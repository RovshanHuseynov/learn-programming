package lesson0.eolymp;

import java.util.Scanner;

public class Pr9934 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int h = s / 3600;
        int m = (s - h * 3600) / 60;
        int sec = s - h * 3600 - m * 60;

        System.out.println(h + " " + m + " " + sec);
    }
}
