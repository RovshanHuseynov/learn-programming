package lesson0.eolymp;

import java.util.Scanner;

public class Pr9561 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int [] max = new int[m];
        int input;

        for(int i=0; i<m; i++){
            max[i] = -100;
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                input = in.nextInt();
                if(input > max[j]) max[j] = input;
            }
        }

        for(int i=0; i<m; i++) System.out.print(max[i] + " ");
    }
}
