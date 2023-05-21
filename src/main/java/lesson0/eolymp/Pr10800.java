package lesson0.eolymp;

import java.util.Scanner;

public class Pr10800 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long ans = 0, temp;
        int i=1;
        while (true){
            temp = n/i-(i-1);
            ans += temp;
            i++;
            if(temp <= 0) break;
        }

        System.out.println(ans);
    }
}
