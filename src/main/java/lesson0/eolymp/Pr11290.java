package lesson0.eolymp;

import java.util.Scanner;

public class Pr11290 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans = 0;
        for(int i=0; i<n; i++){
            ans += calculateScore(in.next());
        }
        System.out.println(ans);
    }

    private static int calculateScore(String s){
        int score = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'A') score += 4;
            else if(s.charAt(i) == 'K') score += 3;
            else if(s.charAt(i) == 'Q') score += 2;
            else if(s.charAt(i) == 'J') score += 1;
        }
        return score;
    }
}
