package lesson0.eolymp;

import java.util.Scanner;

public class Pr7367 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n = in.nextDouble();
        int day=0;
        double cur = 10.0;
        while(n>0){
            day++;
            cur = cur + cur/10;
            n -= cur;
            //System.out.println(day + " " + cur + " " + n);
        }
        System.out.println(day+1);
    }
}