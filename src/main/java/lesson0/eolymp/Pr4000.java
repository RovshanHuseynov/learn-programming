package lesson0.eolymp;

import java.util.Scanner;

public class Pr4000 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int start = in.nextInt();
        int x, ans = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                x = in.nextInt();
                if(i == start) ans += x;
            }
        }
        System.out.println(ans);
    }
}
