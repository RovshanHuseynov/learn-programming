package lesson0.eolymp;

import java.util.Scanner;

public class Pr9967 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long last = 4L;
        long sum = 2L;
        for(int i=1; i<=n; i++){
            System.out.print(sum + " ");
            sum += last;
            last += 2L;
        }
    }
}
