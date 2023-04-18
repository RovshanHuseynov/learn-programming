package lesson0.eolymp;

import java.util.Scanner;

public class Pr11436 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String template = "!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ ";
                //in.nextLine();
        //String template = ".,'?!*-_@()[]{}:;/\"\\";
        int cnt=0;

        System.out.println(s);
        for(int i=0; i<s.length(); i++){
            //System.out.println(s.charAt(i) + " " + template.contains(s.charAt(i) + ""));
            if(template.contains(s.charAt(i) + "")) cnt++;
        }
        System.out.println(cnt);
    }
}
