package lesson0.eolymp;

import java.util.Scanner;

public class Pr2538 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s;
        int len,cnt;
        char ch;
        while(true){
            s = in.nextLine();
            len = s.length();
            cnt = 1;
            ch = s.charAt(0);
            if(len == 1 && ch == '0') break;

            for(int i=1; i<len; i++){
                if(s.charAt(i) == ch){
                    cnt++;
                }
                else {
                    System.out.print(cnt);
                    System.out.print(ch);
                    cnt = 1;
                    ch = s.charAt(i);
                }
            }
            System.out.print(cnt);
            System.out.print(ch);
            System.out.println();
        }
    }
}
