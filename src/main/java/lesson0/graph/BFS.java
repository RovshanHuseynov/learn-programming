package lesson0.graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS {
    // source: https://www.youtube.com/watch?v=pcKY4hjDrxk
    /*
    example1:
    7 6
    1 4
    1 5
    1 2
    2 7
    2 6
    2 3
    */
    /*
    10 13
    1 4
    3 4
    3 10
    1 2
    2 3
    3 9
    5 6
    2 5
    2 8
    2 7
    5 8
    5 7
    7 8
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
        bfs();
    }

    public static void bfs(){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        used[1] = true;

        while (!queue.isEmpty()){
            int from = queue.poll();
            System.out.print(from + " ");
            for(int to=1; to<=n; to++){
                if(!used[to] && arr[from][to] == 1){
                    queue.add(to);
                    used[to] = true;
                }
            }
        }
    }
}
