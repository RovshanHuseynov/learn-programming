package lesson0.eolymp;

import java.util.Scanner;

public class Pr9961 {
    private static int n;
    private static int k;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        k = in.nextInt();
        boolean [] used = new boolean[n+1];
        for(int i=1; i<=n; i++) {
            used[i] = true;
            generate(1, i+"" , used);
            used[i] = false;
        }
    }

    private static void generate(int len, String cur, boolean [] used){
        if(len == k) System.out.println(cur);
        else {
            for(int i=1; i<=n; i++){
                if(!used[i]) { used[i] = true; generate(len+1, cur + " " + i, used); used[i] = false; }
            }
        }
    }
}
