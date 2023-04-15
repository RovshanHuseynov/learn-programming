package lesson0.eolymp;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Pr9648 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        long sum = 0;
        for(int i=a; i<=b; i++) {
            String s = Stream.of(String.valueOf(i).split("")).sorted().collect(Collectors.joining());
            //System.out.println(s + " " + Integer.parseInt(s));
            sum += Integer.parseInt(s);
        }
        System.out.println(sum);
    }
}
