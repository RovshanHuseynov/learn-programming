package lesson0.eolymp;

import java.util.Scanner;

public class Pr3841 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,val;
        long sum;
        while(in.hasNextInt()){
            n = in.nextInt();
            sum = 0L;
            for(int i=1; i<=n; i++){
                val = in.nextInt();
                sum += val;
            }

            if(sum%n == 0) System.out.println("ok\n");
            else System.out.println("fail\n");
        }
    }
}
