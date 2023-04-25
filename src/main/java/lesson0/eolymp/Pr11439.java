package lesson0.eolymp;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Pr11439 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        AtomicInteger cntLow = new AtomicInteger();
        AtomicInteger cntUp = new AtomicInteger();

        s.chars()
                .forEach(val -> {
                    if(val >= 'a' && val <= 'z') cntLow.getAndIncrement();
                    else cntUp.getAndIncrement();
                });

        if(cntLow.intValue() == 0 || cntUp.intValue() == 0){
            System.out.println("YES " + s.length());
        }
        else {
            System.out.println("NO " + Math.min(cntLow.intValue(), cntUp.intValue()));
        }
    }
}
