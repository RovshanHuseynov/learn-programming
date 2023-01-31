package lesson0.eolymp;

import java.util.Scanner;

public class Pr9565 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int input;
        int max;
        int min = 100;

        for(int i=0; i<n; i++){
            max = -100;
            for(int j=0; j<m; j++){
                input = in.nextInt();
                if(input > max) max = input;
            }
            if(max < min) min = max;
        }
        System.out.println(min);
    }
}
