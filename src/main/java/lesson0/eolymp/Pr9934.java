package lesson0.eolymp;

import java.util.Scanner;

public class Pr9934 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int day = m / 1440;
        int hour = (m - day * 1440) / 60;
        int minute = m - day * 1440 - hour * 60;
        System.out.println(++day + " " + hour + " " + minute);
    }
}
