package lesson0.eolymp;

import java.util.Scanner;

public class Pr977 {
    static int n;
    static int [][] a;
    static int [] used;

    private static void dfs(int from){
        used[from] = 1;
        for(int to=1; to<=n; to++){
            if(used[to] == 0 && a[from][to] == 1){
                dfs(to);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        a = new int[n+1][n+1];
        used = new int[n+1];

        int cnt=0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                a[i][j] = in.nextInt();
                cnt = cnt + a[i][j];
            }
        }

        if(n - 1 != cnt / 2) System.out.println("NO");
        else {
            dfs(1);

            boolean ans = false;
            for(int i=1; i<=n; i++){
                if(used[i] == 0){
                    System.out.println("NO");
                    ans = true;
                }
            }
            if(!ans) System.out.println("YES");
        }
    }
}
