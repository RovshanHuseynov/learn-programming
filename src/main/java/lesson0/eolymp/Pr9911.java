package lesson0.eolymp;

import java.util.Scanner;

public class Pr9911 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();

        if(a > b) {
            a = a + b;
            a = a - b;
            b = a - b;
        }

        int cnt=0;
        for(long i=a; i<=b; i++){
            if(i%2==0) cnt++;
        }
        System.out.println(cnt);
    }
}
