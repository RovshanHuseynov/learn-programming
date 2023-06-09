package lesson0.eolymp;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Pr6958 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text;
        while(in.hasNext()){
            text = in.nextLine();
            String pattern1 = "da+dd?(i|y)";
            Pattern pattern = Pattern.compile(pattern1);
            if(pattern.matcher(text).matches()) System.out.println("She called me!!!");
            else System.out.println("Cooing");
        }
    }
}