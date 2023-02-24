package lesson0.eolymp;

import java.util.Scanner;

public class Pr977 {
    static int n;
    static int [][] a;
    static boolean [] used;

    private static void dfs(int from){
        used[from] = true;
        for(int to=0; to<n; to++){
            if(!used[to] && a[from][to] == 1){
                dfs(to);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        a = new int[n][n];
        used = new boolean[n];

        int cnt=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                a[i][j] = in.nextInt();
                cnt = cnt + a[i][j];
            }
        }

        if(cnt % 2 == 1 ||  n - 1 != cnt / 2) System.out.println("NO");
        else {
            dfs(0);

            boolean ans = false;
            for(int i=0; i<n; i++){
                if(!used[i]){
                    System.out.println("NO");
                    ans = true;
                }
            }
            if(!ans) System.out.println("YES");
        }
    }
}
