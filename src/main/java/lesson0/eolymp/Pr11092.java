package lesson0.eolymp;

import java.util.Scanner;

public class Pr11092 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        //String a = "hello";
        //String b = "myworld";
        int [] lex = new int[26];

        for(int i=0; i<a.length(); i++){
            lex[a.charAt(i)-97]++;
        }
        for(int i=0; i<b.length(); i++){
            lex[b.charAt(i)-97]++;
        }

        /*for(int i=0; i<26; i++){
            System.out.print(lex[i] + " ");
        }*/

        int cnt = a.length();
        while(cnt > 0){
            cnt--;
            for(int i=0; i<26; i++){
                if(lex[i] > 0){
                    System.out.print((char)(i+97));
                    lex[i]--;
                    break;
                }
            }
        }
        System.out.println();
    }
}
