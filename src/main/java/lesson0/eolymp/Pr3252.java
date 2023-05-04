package lesson0.eolymp;

import java.util.Scanner;

public class Pr3252 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        char c;
        int p,q;
        for(int i=1; i<=m; i++){
            c = in.next().charAt(0);
            p = in.nextInt();
            q = in.nextInt();
            System.out.println(c);
        }
    }
}
