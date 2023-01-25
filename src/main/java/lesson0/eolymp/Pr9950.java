package lesson0.eolymp;

import java.util.Scanner;

public class Pr9950 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long m = in.nextLong();
        int ans = 0;
        long i = 1L;

        while(true){
            if(i*i <= m) ans++;
            else break;
            i++;
        }
        System.out.println(ans);
    }
}
