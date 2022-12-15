package lesson0.graph;

import java.util.Scanner;

public class DFS {
    // source: https://www.youtube.com/watch?v=pcKY4hjDrxk
    /*
    input:
    7 6
    1 4
    1 5
    1 2
    2 7
    2 6
    2 3
    */
    static int[][] arr;
    static boolean[] used;
    static int n,m;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        arr = new int[n+1][n+1];
        used = new boolean[n+1];
        for(int i=0; i<m; i++){
            int x = in.nextInt();
            int y = in.nextInt();
            arr[x][y] = 1;
            arr[y][x] = 1;
        }
        dfs(1);
    }

    public static void dfs(int node){
        for(int i=1; i<=n; i++){
            if(!used[i] && arr[node][i] == 1){
                used[i] = true;
                System.out.print(i + " ");
                dfs(node);
            }
        }
    }
}
