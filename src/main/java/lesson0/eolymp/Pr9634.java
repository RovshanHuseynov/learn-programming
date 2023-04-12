package lesson0.eolymp;

import java.util.Scanner;

public class Pr9634 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=1; i<=n; i++){
            String input = in.next();
            float x = Float.parseFloat(input);
            char y = in.nextLine().charAt(1);

            if(x >= 3.5 && (y == 'A' || y == 'B')) System.out.println("1");
            else System.out.println("0");
        }
    }
}
