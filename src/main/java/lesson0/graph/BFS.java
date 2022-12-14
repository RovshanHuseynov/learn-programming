package lesson0.graph;

import java.util.Scanner;

public class BFS {
    // source: https://www.youtube.com/watch?v=pcKY4hjDrxk
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0; i<m; i++){
            int x = in.nextInt();
            int y = in.nextInt();
            arr[x][y] = 1;
            arr[y][x] = 1;
        }
    }

    public static void bfs(int node){

    }
}
