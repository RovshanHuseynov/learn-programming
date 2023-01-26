package lesson0.eolymp;

import java.util.Scanner;

public class Pr9952 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long ans = 0;

        long s = 1;
        while(s * s <= b) {
            if (s*s >= a && s * s <= b) ans++;
            s++;
        }
        System.out.println(ans);
    }
}
