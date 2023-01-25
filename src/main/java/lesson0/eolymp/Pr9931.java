package lesson0.eolymp;

import java.util.Scanner;

public class Pr9931 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int ans = k/1024;
        if(k % 1024 != 0) ans++;
        System.out.println(ans);
    }
}
