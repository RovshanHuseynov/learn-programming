package lesson0.eolymp;

import java.util.Scanner;

public class Pr9983 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p,j;
        for(int i=0; i<n; i++){
            if(i % 2 == 0) p = 0;
            else p = 1;
            j=0;
            while(j<n){
                System.out.print(p);
                if(p == 0) p = 1;
                else p = 0;
                j++;
            }
            System.out.println();
        }
    }
}
