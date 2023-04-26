package lesson0.eolymp;

import java.util.Scanner;

public class Pr11441 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        System.out.println(input.substring(0,input.indexOf('-')));
        System.out.println(input.substring(input.indexOf('-')+1,input.indexOf('_')));
        System.out.println(input.substring(input.indexOf('_')+1));
    }
}
