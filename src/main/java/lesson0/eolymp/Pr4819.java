package lesson0.eolymp;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Pr4819 {
    static boolean [][] a;
    static boolean [] used;
    static int [] dis;
    static int n;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int m = in.nextInt();
        int s = in.nextInt();
        a = new boolean[n+1][n+1];
        used = new boolean[n+1];
        dis = new int[n+1];
        int u,v;
        for(int i=1; i<=m; i++){
            u = in.nextInt();
            v = in.nextInt();
            a[v][u] = true;
        }
        bfs(s);
        int max = 0;
        for(int i=1; i<=n; i++){
            max = Math.max(max, dis[i]);
        }
        //System.out.println(Arrays.toString(dis));
        System.out.println(max);
    }

    private static void bfs(int start){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);

        int from;
        while(!queue.isEmpty()){
            from = queue.poll();
            for(int to=1; to<=n; to++){
                if(!used[to] && a[from][to]){
                    queue.add(to);
                    used[to] = true;
                    dis[to] = dis[from] + 1;
                }
            }
        }
    }
}
