package lesson0.eolymp;

import java.util.Scanner;

public class Pr11297 {
    static long [][] memo = new long[26][26];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        System.out.println(function(x,y));
    }

    private static long function(int x, int y){
        if(x<=0 || y<=0) return 1;

        if(x<=y){
            if(memo[x - 1][y] == 0)
                memo[x - 1][y] = function(x - 1, y);

            if(memo[x][y - 1] == 0)
                memo[x][y - 1] = function(x, y - 1);

            return memo[x - 1][y] + memo[x][y - 1] + 1;
        } else{
            if(memo[x][y / 2] == 0)
                memo[x][y / 2] = function(x, y / 2);

            return memo[x][y / 2] + 2;
        }
    }
}
