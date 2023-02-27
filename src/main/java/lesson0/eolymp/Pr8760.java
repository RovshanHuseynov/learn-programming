package lesson0.eolymp;

import java.util.Scanner;
import java.util.Stack;

public class Pr8760 {
    static int [][] arr;
    static boolean [] used;
    static int n;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        arr = new int[n+1][n+1];
        used = new boolean[n+1];
        int m = in.nextInt();
        int x,y;
        for(int i=0; i<m; i++){
            x = in.nextInt();
            y = in.nextInt();
            arr[x][y] = 1;
            arr[y][x] = 1;
        }
        dfs(in.nextInt());
    }

    private static void dfs(int start){
        Stack<Integer> s = new Stack<>();
        used[start] = true;
        s.push(start);
        int from;

        while(!s.empty()){
            from = s.pop();
            System.out.print(from + " ");
            for(int to=1; to<=n; to++){
                if(arr[from][to] == 1 && !used[to]){
                    s.push(to);
                    used[to] = true;
                }
            }
        }
    }
}
