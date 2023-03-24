package lesson0.eolymp;

import java.util.Scanner;
import java.util.Stack;

public class Pr4259 {
    public static void main(String[] args) {
        // solution video: https://www.youtube.com/watch?v=ufwPuyxkNVE
        Scanner in = new Scanner(System.in);
        Stack<Integer> m = new Stack<>(); // main stack
        Stack<Integer> s = new Stack<>(); // supportion stack
        int n = in.nextInt();
        int t, val, top;
        for(int i=0; i<n; i++){
            t = in.nextInt();
            if(t == 1){
               val = in.nextInt();
               m.push(val);
               if(s.size() == 0 || val < s.peek()) s.push(val);
            }
            else if (t == 2) {
                top = m.pop();
                if(!s.empty() && top == s.peek()) s.pop();
            }
            else {
                System.out.println(s.peek());
            }
        }
    }
}
