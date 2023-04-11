package lesson0.eolymp;

import java.util.Scanner;

public class Pr5103 {
    public static void main(String[] args) {
        // https://site.ada.edu.az/~medv/cp/Week%201/fibon.pdf
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] g = new int[n+2];
        int [] f = new int[n+2];
        g[0] = 1;
        g[1] = 2;
        g[2] = 3;
        for(int i=3; i<=n; i++){
            g[i] = g[i-1] + g[i-2];
        }
        f[1] = g[1];
        f[2] = g[2];
        for(int i=3; i<=n; i++){
            f[i] = g[i-1] + g[i-3];
        }
        System.out.println(f[n]);
    }
}
