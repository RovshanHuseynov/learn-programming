package lesson0.eolymp;

import java.util.Scanner;

public class Pr10507 {
    // press Ctrl+D to end input
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;

        while(in.hasNextLine()) {
            String s = in.nextLine();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
                    sum += (int) s.charAt(i) - 48;
            }
        }

        System.out.println(sum);
    }
}
