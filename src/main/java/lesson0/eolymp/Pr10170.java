package lesson0.eolymp;

import java.util.Scanner;

public class Pr10170 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans = 0;

        for(int i=1; i<n; i++){
            ans += (n-1)/i;
        }
        System.out.println(ans);
    }
}
