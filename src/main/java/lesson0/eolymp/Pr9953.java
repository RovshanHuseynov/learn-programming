package lesson0.eolymp;

import java.util.Scanner;

public class Pr9953 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long ans = 0;

        long hasil = 2;
        while(hasil<= b) {
           if(hasil >= a) ans++;
           hasil*=2;
        }
        System.out.println(ans);
    }
}
