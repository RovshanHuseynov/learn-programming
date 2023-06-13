package lesson0.eolymp;

import java.util.Scanner;

public class Pr8259 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int cnt=0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                cnt++;
                if(div(cnt,k)) System.out.print(".");
                else System.out.print("*");
            }
            System.out.println();
        }
    }

    private static boolean div(int n, int k){
        int cnt = 0;
        if((int)Math.sqrt(n)*(int)Math.sqrt(n) == n){
            cnt--;
        }
        for(int i=1; i<=n/2; i++){
            if(n%i==0) {
                cnt+=2;
                if(cnt > k) return true;
            }
        }
        return false;
    }
}
