package lesson0.eolymp;

import java.util.Scanner;

public class Pr11437 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String input;
        in.nextLine();
        for(int i=1; i<=n; i++){
            input = in.nextLine();
            if(input.contains("BSM")) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
