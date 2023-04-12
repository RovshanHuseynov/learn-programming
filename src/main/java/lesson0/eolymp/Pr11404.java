package lesson0.eolymp;

import java.util.Scanner;

public class Pr11404 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String t = in.nextLine();
        String c = in.nextLine();
        for(int i=0; i<t.length(); i++){
            if(i!=c.length())System.out.print(t.charAt(i) + "" + c.charAt(i));
            else System.out.print(t.charAt(i));
        }
        System.out.println();
    }
}
