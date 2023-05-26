package lesson0.eolymp;

import java.util.Scanner;

public class Pr9608 {
    private static int n;
    private static final double MAX = Double.MAX_VALUE;
    private static double [] dis;
    private static boolean [] used;
    private static double [][] g;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        g = new double[n+1][n+1];
        dis = new double[n+1];
        used = new boolean[n+1];
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        double d = in.nextDouble();
        int m = in.nextInt();
        int u,v;
        double w;
        for(int i=1; i<=m; i++){
            u = in.nextInt();
            v = in.nextInt();
            w = in.nextDouble();
            g[u][v] = w;
            g[v][u] = w;
        }

        //System.out.printf("%.2f\n", relax(a,b));
        //System.out.printf("%.2f\n", relax(b,c));
        //System.out.printf("%.2f\n", relax(a,c));
        if(relax(a,b) == MAX) System.out.println("-1");
        else System.out.printf("%.1f\n", (relax(a,b) + relax(b,c) - relax(a,c)) * d);
    }

    private static double relax(int start, int end){
        dis = new double[n+1];
        used = new boolean[n+1];
        for(int i=0; i<=n; i++){
            dis[i] = MAX;
        }
        dis[start] = 0.0;

        while(true){
            double min = MAX;
            int minInd = -1;
            for(int i=1; i<=n; i++){
                if(!used[i] && dis[i] < min){
                    min = dis[i];
                    minInd = i;
                }
            }

            if(minInd == -1) break;
            else dijkstra(minInd);
        }

        return dis[end];
    }

    private static void dijkstra(int from){
        used[from] = true;
        for(int i=1; i<=n; i++){
            if(!used[i] && g[from][i] > 0 && dis[i] > dis[from] + g[from][i]){
                dis[i] = dis[from] + g[from][i];
            }
        }
    }
}
