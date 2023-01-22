package lesson0.eolymp;

import java.util.Scanner;

public class Pr10508 {
    // press Ctrl+D to end input
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] cnt = new int[26];

        while(in.hasNextLine()) {
            String s = in.nextLine().toLowerCase();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
                    cnt[(int) s.charAt(i) - 97]++;
            }
        }

        for(int i=0; i<25; i++){
            System.out.print(cnt[i] + " ");
        }
        System.out.println(cnt[25]);
    }
}
