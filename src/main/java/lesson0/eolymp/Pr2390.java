package lesson0.eolymp;

import java.util.Scanner;

public class Pr2390 {
    static int n;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for(int i=1; i<=n; i++) {
            func(i, i, ""+i);
        }
    }

    private static void func(int sum, int last, String s){
        if(sum == n){
            System.out.println(s);
        } else if(sum > n) return;

        for(int i=1; i<=n && i<=last; i++){
            func(sum+i, i, s+" "+i);
        }
    }
}
