package lesson0.eolymp;

import java.util.Collections;
import java.util.Scanner;

public class Pr9958 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int val;
        double sum = 0.0;
        int cnt = 0;
        for(int i=0; i<n; i++){
            val = in.nextInt();
            if((-1*val)%2 == 1 && val < 0){
                sum += val;
                cnt++;
            }
        }
        if(cnt == 0) System.out.println("NO");
        else {
            System.out.printf("%.2f\n",sum/cnt);
        }
    }
}
