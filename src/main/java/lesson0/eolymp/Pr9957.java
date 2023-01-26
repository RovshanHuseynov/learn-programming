package lesson0.eolymp;

import java.util.Scanner;

public class Pr9957 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x;
        int min = 0;
        for(int i=0; i<n; i++){
            x = in.nextInt();
            if(x < 0 && x < min) min = x;
        }

        if(min == 0) System.out.println("NO");
        else System.out.println(min);
    }
}
