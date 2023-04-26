package lesson0.eolymp;

import java.util.Scanner;

public class Pr11438 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String input;
        in.nextLine();
        for(int i=1; i<=n; i++){
            input = in.nextLine();
            System.out.println(input.chars().filter(val -> val >= '0' && val <= '9').count());
        }
    }
}
