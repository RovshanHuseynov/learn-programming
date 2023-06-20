package lesson0.eolymp;

import java.util.Scanner;
import java.util.Stack;

public class Pr1663 {
    static boolean correct(String text){
        int len = text.length();
        Stack<Character> s = new Stack<>();
        for(int i=0; i<len; i++){
            if(text.charAt(i) == '(') s.push('(');
            else {
                if(s.empty()) return false;
                else s.pop();
            }
        }
        return s.empty();
    }

    static boolean correct1(String text){
        int len = text.length();
        int cntOpen = 0;
        for(int i=0; i<len; i++){
            if(text.charAt(i) == '(') cntOpen++;
            else {
                if(cntOpen == 0) return false;
                else cntOpen--;
            }
        }
        return cntOpen == 0;
    }

    static int n;
    static void generate(String cur){
        if(cur.length() == n) {
            if (correct1(cur)) System.out.println(cur);
            //else return;
        }
        else {
            generate(cur + "(");
            generate(cur + ")");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        n = n*2;
        generate("(");
    }
}
