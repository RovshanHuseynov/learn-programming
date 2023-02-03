package lesson0.eolymp;

import java.util.Scanner;
import java.util.Stack;

public class Pr855 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        if(n%2==0) print("", n);
    }

    // isValid 0 - not Valid and not possible to be Valid
    // isValid 1 - not Valid, but possible to be Valid
    // isValid 2 - Valid
    private static int isValid(String text){
        Stack<Character> s = new Stack<>();
        for(int i=0; i< text.length(); i++){
            if(text.charAt(i) == '(' || text.charAt(i) == '[') s.push(text.charAt(i));
            else {
                if(s.empty()) return 0;
                char top = s.peek();
                char cur = text.charAt(i);
                if(cur == ')' && top != '(') return 0;
                else if(cur == ']' && top != '[') return 0;
                else s.pop();
            }
        }

        if(s.empty()) return 2;
        else return 1;
    }

    private static void print(String text, int target) {
        if (text.length() == target){
            if (isValid(text) == 2) {
                System.out.println(text);
            }
        }
        else if(isValid(text) != 0){
            print(text + '(', target);
            print(text + '[', target);
            print(text + ')', target);
            print(text + ']', target);
        }
    }
}
