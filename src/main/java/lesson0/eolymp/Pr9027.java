package lesson0.eolymp;

import java.util.Scanner;

public class Pr9027 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        int [] cnt = new int[10];

        for(int i=0; i<text.length(); i++){
            cnt[(int)text.charAt(i) - 48]++;
        }

        for(int i=0; i<10; i++){
            System.out.print(cnt[i] + " ");
        }
    }
}
