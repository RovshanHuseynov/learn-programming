package lesson0.eolymp;

import java.util.Scanner;

public class Pr9956 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x;
        int max = -101;
        for(int i=0; i<n; i++){
            x = in.nextInt();
            if(x%2 == 0 && x > max) max = x;
        }

        if(max == -101) System.out.println("NO");
        else System.out.println(max);
    }
}
