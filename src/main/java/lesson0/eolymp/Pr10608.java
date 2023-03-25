package lesson0.eolymp;

import java.util.Scanner;
import java.util.Stack;

public class Pr10608 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack<Integer> m = new Stack<>(); // main stack
        String t;
        while(in.hasNext()) {
            t = in.next();
            if (t.equals("push")) {
                m.push(in.nextInt());
            } else if (t.equals("pop")) {
                m.pop();
            } else {
                if(!m.empty()) System.out.println(m.peek());
            }
        }
    }
}
