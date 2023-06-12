package lesson0.eolymp;

import java.util.Scanner;

public class Pr9960 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int val;
        int ind_min = -1;
        int min = 101;
        for(int i=0; i<n; i++){
            val = in.nextInt();
            if(val%2 == 0 && val < min){
                min = val;
                ind_min = i;
            }
        }
        if(ind_min == -1) System.out.println("NO");
        else System.out.println(ind_min + " " + min);
    }
}
