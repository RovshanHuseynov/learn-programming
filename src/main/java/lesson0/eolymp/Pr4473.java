package lesson0.eolymp;

import java.util.Scanner;

public class Pr4473 {
    static int[] arr;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] input = new int[n+1];
        arr = new int[n+1];

        for(int i=1; i<=n; i++){
            input[i] = in.nextInt();
        }

        int x,y;

        build(1, n);

        int m = in.nextInt();
        for(int i=0; i<m; i++){
            x = in.nextInt();
            y = in.nextInt();

            if(x > y){
                x = x + y;
                y = x - y;
                x = x - y;
            }
            System.out.println(max(x,y));
        }
    }

    private static void build(int left, int right){
        int mid = (left + right) / 2;

        //if(left == right)
    }

    private static int max(int left, int right){
        return 0;
    }
}
