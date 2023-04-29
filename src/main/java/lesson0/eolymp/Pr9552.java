package lesson0.eolymp;

import java.util.Scanner;

public class Pr9552 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long cnt = n / 3 + n / 5 - n / 15;

        //System.out.println(cnt);
        while (cnt > 0) {
            n++;
            if (n % 3 != 0 && n % 5 != 0) cnt--;
        }
        System.out.println(n);

    }
}
