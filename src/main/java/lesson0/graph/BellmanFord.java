package lesson0.graph;

import java.util.Scanner;

public class BellmanFord {
    static int n, m, start;
    static int [][] a;
    static Pair [] edges;
    static int [] dis;
    static int [] parent;
    static int MAX = Integer.MAX_VALUE;
    public static void main(String[] args) {
        // video tutorial: https://www.youtube.com/watch?v=FtN3BYH2Zes
        /* the general idea is that check all possibilities and pick the best one
         relax all the edges for n-1 times. Let's say there are 10 edges total and
         7 vertices,so we will call relax method for 6 times
         Complexity of Bellman Ford Algorithm is O(n*m) - n is number of vertices and m is number of edges
         which is in complete graph is O(n3) - n is number of vertices
         is there is a cycle in graph and total weight of the cycle is negative, Bellman Ford will not work correctly there
         to find whether there is a negative cycle is graph, after finishing relax n-1 times, we can do one more relax and
         check whether distances are changed. If changed it means there a negative weighted cycle in the graph
         */
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        start = in.nextInt();
        edges = new Pair[m+1];
        a = new int[n+1][n+1];
        dis = new int[n+1];
        parent = new int[n+1];
        int u,v,z;
        for(int i=1; i<=m; i++){
            u = in.nextInt();
            v = in.nextInt();
            z = in.nextInt();
            edges[i] = new Pair(u,v);
            a[u][v] = z;
            a[v][u] = z;
        }

        for(int i=1; i<=n; i++){
            dis[i] = MAX;
        }
        dis[start] = 0;

        for(int i=1; i<n; i++){
            // relax all the edges n-1 times
            relax();
        }

        for(int i=1; i<=n; i++){
            System.out.println("node: " + i + " - dis: " + dis[i] + " - parent: " + parent[i]);
        }
    }

    static void relax(){
        int from, to;
        for(int i=1;  i<=m; i++) {
            from = edges[i].u;
            to = edges[i].v;
            if (dis[to] > dis[from] + a[from][to]) {
                dis[to] = dis[from] + a[from][to];
                parent[to] = from;
            }
        }
    }
}

class Pair {
    int u,v;
    Pair(int u, int v){
        this.u = u;
        this.v = v;
    }
}

/*
7 10 1
1 2 6
1 3 5
1 4 5
2 5 -1
3 2 -2
3 5 1
4 3 -2
4 6 -1
5 7 3
6 7 3
 */