package lesson0.graph;

import java.util.Scanner;

public class Dijkstra {
    static int n, start;
    static int [][] a;
    static boolean [] used;
    static int [] dis;
    static int [] parent;
    static int MAX = Integer.MAX_VALUE;
    public static void main(String[] args) {
        // video tutorial: https://www.youtube.com/watch?v=GazC3A4OQTE
        // Complexity of Bellman Ford Algorithm is O(n*m) - n is number of vertices and m is number of edges
        // which is in complete graph is O(n2) - n is number of vertices
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int m = in.nextInt();
        start = in.nextInt();
        a = new int[n+1][n+1];
        used = new boolean[n+1];
        dis = new int[n+1];
        parent = new int[n+1];
        int u,v,z;
        for(int i=0; i<m; i++){
            u = in.nextInt();
            v = in.nextInt();
            z = in.nextInt();
            a[u][v] = z;
            a[v][u] = z;
        }

        for(int i=1; i<=n; i++){
            dis[i] = MAX;
            parent[i] = i;
        }

        dis[start] = 0;
        relax(start);
        dijkstra();

        for(int i=1; i<=n; i++){
            System.out.println("node: " + i + " - dis: " + dis[i] + " - parent: " + parent[i]);
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

    private static void dijkstra(){
        int min;
        int node;
        while(true){
            min = MAX;
            node = -1;
            for(int i=1; i<=n; i++){
                if(!used[i] && dis[i] < min){
                    min = dis[i];
                    node = i;
                }
            }

            if(node == -1) break;
            else relax(node);
        }
    }
}
// 1-S 2-A 3-B 4-C 5-D 6-E 7-F 8-G 9-H 10-I 11-K 12-L 13-J
/*
13 18 1
1 2 7
1 3 2
1 4 3
2 3 3
2 5 4
3 5 4
3 9 1
4 12 2
5 7 5
6 8 2
6 11 5
7 9 3
8 9 2
10 11 4
10 12 4
10 13 6
11 13 4
12 13 4
 */