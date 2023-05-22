package lesson0.eolymp;

import java.util.Scanner;

public class Pr8766 {
    static int [] a;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        a = new int[n+1];
        int k = in.nextInt();
        for(int i=1; i<=n; i++){
            a[i] = in.nextInt();
        }
        int operation;
        for(int i=1; i<=k; i++){
            operation = in.nextInt();

            if(operation == 1) {
                int ind = in.nextInt();
                int val = in.nextInt();
                a[ind] = val;
            }
            else {
                int ind = in.nextInt();
                System.out.println(a[ind]);
            }
        }
    }
}
