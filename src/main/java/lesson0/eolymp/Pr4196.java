package lesson0.eolymp;

import java.util.Scanner;

public class Pr4196 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b,n;
        a = in.nextInt();
        b = in.nextInt();
        n = in.nextInt();
        int ans = 1;
        while ((a*b*ans)%n!=0) ans++;
        System.out.println(ans);
    }
}
