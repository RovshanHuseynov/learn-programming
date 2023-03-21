package lesson0.eolymp;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Stack;

public class Pr4259 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack<Integer> s = new Stack<>();
        int n = in.nextInt();
        int min = Integer.MAX_VALUE;
        int t, p, top;
        for(int i=0; i<n; i++){
            t = in.nextInt();
            if(t == 1){
                p = in.nextInt();
                s.push(p);
                if(p < min) min = p;
            }
            else if (t == 2) {
                top = s.peek();
                s.pop();
                //System.out.print("print ");
                //s.stream().forEach(val -> System.out.print(val + " "));
                //System.out.println();
                if(top == min) min = s.stream().min(Comparator.comparingInt(o -> o)).orElse(0);
            }
            else {
                System.out.println(min);
            }
        }
    }
}
