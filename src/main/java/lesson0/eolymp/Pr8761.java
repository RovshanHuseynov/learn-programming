package lesson0.eolymp;

import java.util.Scanner;

public class Pr8761 {
    static int [][] arr;
    static boolean [] used;
    static int n;
    static int [] x;
    static int [] y;
    static int cnt;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        arr = new int[n+1][n+1];
        used = new boolean[n+1];
        x = new int[n+1];
        y = new int[n+1];
        cnt = 1;
        int m = in.nextInt();
        for(int i=0; i<m; i++){
            int x = in.nextInt();
            int y = in.nextInt();
            arr[x][y] = 1;
            arr[y][x] = 1;
        }
        int start = in.nextInt();
        used[start] = true;
        x[start] = cnt++;
        dfs(start);
        y[start] = cnt;

        for(int i=1; i<=n; i++){
            System.out.println(x[i] + " " + y[i]);
        }
    }

    private static void dfs(int from){
        for(int to=1; to<=n; to++){
            if(arr[from][to] == 1 && !used[to]){
                used[to] = true;
                x[to] = cnt++;
                dfs(to);
                y[to] = cnt++;
            }
        }
    }
}
