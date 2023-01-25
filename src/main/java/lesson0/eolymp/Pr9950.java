package lesson0.eolymp;

import java.util.Scanner;

public class Pr9950 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long m = in.nextLong();
        int ans = 0;
        long hasil = 1;

        while(true) {
            hasil*=2;
            if(hasil > m) break;
            ans++;
        }
        System.out.println(ans);
    }
}
