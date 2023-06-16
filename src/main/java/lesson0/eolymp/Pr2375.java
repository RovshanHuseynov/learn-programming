package lesson0.eolymp;

import java.util.Scanner;

public class Pr2375 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c = in.nextInt();
        int a;
        String t;
        int sumAll = 0, sumBedroom = 0, sumBalcony = 0;
        for(int i=1; i<=n; i++){
            a = in.nextInt();
            t = in.next();
            //System.out.println(a + " ." + t + ".");
            sumAll += a;
            if(t.equals("bedroom")) sumBedroom += a;
            else if(t.equals("balcony")) sumBalcony += a;
        }
        System.out.println(sumAll);
        System.out.println(sumBedroom);
        //System.out.println(sumBalcony);
        System.out.printf("%.1f\n",((double)sumAll-(double)sumBalcony/2)*c);
    }
}
