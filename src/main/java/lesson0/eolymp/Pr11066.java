package lesson0.eolymp;

import java.util.Scanner;

public class Pr11066 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String input;
        int sum_hh = 0, sum_mm = 0, sum_ss = 0;
        in.nextLine();
        for(int i=0; i<n; i++){
            input = in.nextLine();
            sum_mm += Integer.parseInt(input.substring(0,2));
            sum_ss += Integer.parseInt(input.substring(3,5));
        }

        while(sum_ss >= 60){
            sum_mm++;
            sum_ss-=60;
        }
        while(sum_mm >= 60){
            sum_hh++;
            sum_mm-=60;
        }

        if(sum_hh < 10) System.out.print("0");
        System.out.print(sum_hh);
        System.out.print(":");
        if(sum_mm < 10) System.out.print("0");
        System.out.print(sum_mm);
        System.out.print(":");
        if(sum_ss < 10) System.out.print("0");
        System.out.println(sum_ss);
    }
}
