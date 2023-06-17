package lesson0.eolymp;

import java.util.Scanner;

public class Pr11390 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s;
        while(in.hasNext()){
            s = in.next();
            s.chars()
                    .mapToObj(ch -> (char) ch)
                    .filter(i -> i>='A' && i<='Z')
                    .forEach(System.out::print);
        }
    }
}
