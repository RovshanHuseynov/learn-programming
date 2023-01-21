package lesson0.eolymp;

import java.util.Scanner;

public class Pr9918 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();

        for(int i=0; i<n-1; i++){
            System.out.print(s + " ");
        }
        System.out.println(s);
    }
}
