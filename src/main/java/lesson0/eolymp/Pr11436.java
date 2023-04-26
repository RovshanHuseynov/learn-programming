package lesson0.eolymp;

import java.util.Scanner;

public class Pr11436 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String template = "!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";
        int cnt=0;
        for(int i=0; i<input.length(); i++){
            if(template.contains(input.charAt(i) + "")) cnt++;
        }
        System.out.println(cnt);
    }
}
