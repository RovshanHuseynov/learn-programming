package lesson0.eolymp;

import java.math.BigInteger;
import java.util.Scanner;

public class Pr11440 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String b = in.nextLine();
        char ch;
        if(new BigInteger(a).compareTo(new BigInteger(b)) > 0) ch = '>';
        else if(new BigInteger(a).compareTo(new BigInteger(b)) < 0) ch = '<';
        else ch = '=';
        System.out.println(a + " " + ch + " " + b);
    }
}
