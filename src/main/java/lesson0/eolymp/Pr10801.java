package lesson0.eolymp;

import java.util.Scanner;

public class Pr10801 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        String s;
        int len,sum;

        in.nextLine();
        for(int i=1; i<=t; i++){
            s = in.nextLine();
            len = s.length();
            sum = 0;
            for(int j=0; j<len; j++){
                sum += (int)s.charAt(j) - 48;
            }
            System.out.println(sum);
        }
    }
}
