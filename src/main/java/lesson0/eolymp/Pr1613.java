package lesson0.eolymp;

import java.util.Scanner;

public class Pr1613 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long y;
        boolean flag = false;

        for(long x=1; x*x<=n; x++){
            if(n % ((x+1)*(x+1)) == 0){
                flag = true;
                y = n / ((x+1)*(x+1))*x;
                System.out.println(x + " " + y);
            }
        }

        if(!flag) System.out.println("NO SOLUTION");
    }
}
