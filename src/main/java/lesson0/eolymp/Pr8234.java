package lesson0.eolymp;

import java.util.Scanner;

public class Pr8234 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long first = 0;
        long second = 1;

        if(n <= 0) System.out.println(first);
        else if(n == 1) System.out.println(second);
        else {
            long ans = 0;
            for (int i=0; i<=n; i++) {
                ans = first + second;
                first = second;
                second = ans;
            }
            System.out.println(ans);
        }
    }
}
