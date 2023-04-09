package lesson0.eolymp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Pr625 {
    static int [][] a;
    static int [] dis;
    static int [] parent;
    static boolean [] used;
    static int MAX = Integer.MAX_VALUE;
    static int n,m,s,f;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        s = in.nextInt();
        f = in.nextInt();
        a = new int[n+1][n+1];
        dis = new int[n+1];
        parent = new int[n+1];
        used = new boolean[n+1];
        for(int i=1; i<=n; i++){
            dis[i] = MAX;
            parent[i] = i;
        }

        int u,v,z;
        for(int i=1; i<=m; i++){
            u = in.nextInt();
            v = in.nextInt();
            z = in.nextInt();
            a[u][v] = z;
            a[v][u] = z;
        }

        dis[s] = 0;
        dijkstra();
        /*for(int i=1; i<=n; i++){
            System.out.print(dis[i] + " ");
        }
        System.out.println();
        for(int i=1; i<=n; i++){
            System.out.print(parent[i] + " ");
        }
        System.out.println();*/
        List<Integer> vertices = new ArrayList<>();
        System.out.println(dis[f]);
        while(parent[f] != f){
            vertices.add(f);
            f = parent[f];
        }
        vertices.add(f);
        Collections.reverse(vertices);
        vertices.forEach(val -> System.out.print(val + " "));
    }

    private static void dijkstra(){
        int min, idx;

        while(true) {
            min = MAX;
            idx = -1;
            for (int i = 1; i <= n; i++) {
                if (!used[i] && dis[i] < min) {
                    min = dis[i];
                    idx = i;
                }
            }

            if(idx == -1) break;
            else relax(idx);
        }
    }

    private static void relax(int from){
        used[from] = true;
        for(int to=1; to<=n; to++){
            if(!used[to] && a[from][to] > 0 && dis[to] > dis[from] + a[from][to]){
                dis[to] = dis[from] + a[from][to];
                parent[to] = from;
            }
        }
    }
}
