package lesson0.eolymp;

import java.util.Scanner;

public class Pr4000 {
    static int n;
    static int start;
    static int cnt;
    static int [][] a;
    static boolean [] used;

    private static void dfs(int from){
        used[from] = true;
        for(int to=1; to<=n; to++){
            if(!used[to] && a[from][to] == 1){
                dfs(to);
                cnt++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        a = new int[n+1][n+1];
        used = new boolean[n+1];
        start = in.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                a[i][j] = in.nextInt();
            }
        }
        dfs(start);
        System.out.println(cnt+1);
    }
}
