package lesson0.eolymp;

import java.util.Scanner;

public class Pr4855 {
    static int n;
    static int [][] a;
    static boolean [] used;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        a = new int[n+1][n+1];
        used = new boolean[n+1];
        int cnt=0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                a[i][j] = in.nextInt();
                cnt += a[i][j];
            }
        }
        if(n-1 != cnt/2){
            System.out.println("NO");
        }
        else {
            cnt = 0;
            for (int i = 1; i <= n; i++) {
                if (!used[i]) {
                    dfs(i);
                    cnt++;
                }
            }

            if (cnt > 1) System.out.println("NO");
            else System.out.println("YES");
        }
    }

    static void dfs(int from){
        used[from] = true;
        for(int i=1; i<=n; i++){
            if(a[from][i] == 1 && !used[i]){
                dfs(i);
            }
        }
    }
}
