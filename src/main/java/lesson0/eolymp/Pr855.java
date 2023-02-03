package lesson0.eolymp;

import java.util.Scanner;
import java.util.Stack;

public class Pr855 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        //String text = in.nextLine();
        if(n%2==0)
            print("", n);
    }

    private static boolean isValid(String text){
        Stack<Character> s = new Stack<>();
        for(int i=0; i< text.length(); i++){
            if(text.charAt(i) == '(' || text.charAt(i) == '[') s.push(text.charAt(i));
            else {
                if(s.empty()) return false;
                char top = s.peek();
                char cur = text.charAt(i);
                if(cur == ')' && top != '(') return false;
                else if(cur == ']' && top != '[') return false;
                else s.pop();
            }
        }
        return s.empty() && !text.isEmpty();
    }

    private static void print(String text, int target) {
        //System.out.println(text + " " + text.length());
        //if(!text.isEmpty() && !isValid(text)) return;

        if (text.length() == target){
            if (isValid(text)) System.out.println(text);
        }
        else {
            print(text + '(', target);
            print(text + '[', target);
            print(text + ')', target);
            print(text + ']', target);
        }
    }
}
