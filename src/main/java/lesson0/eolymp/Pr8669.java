package lesson0.eolymp;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Pr8669 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Set<Integer> s = new TreeSet<>();
        for(int i=1; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                s.add(i);
                s.add(n/i);
            }
        }

        s.forEach(i -> System.out.print(i + " "));
    }
}