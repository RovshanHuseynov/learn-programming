package lesson0.eolymp;

import java.util.Scanner;

public class Pr11445 {
    static int n,m;
    static long [] dis;
    static Node11445 [] edges;
    static long max;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        edges = new Node11445[m];
        dis = new long[n+1];
        max = Long.MAX_VALUE;
        for(int i=0; i<=n; i++) dis[i] = max;
        dis[1] = 0;
        int u,v,z;
        for(int i=0; i<m; i++){
            u = in.nextInt();
            v = in.nextInt();
            z = in.nextInt();
            edges[i] = new Node11445(u,v,z);
        }

        for(int i=1; i<n; i++){
            //System.out.println("relax " + i + "-------------------");
            //IntStream.rangeClosed(1,n)
                    //.forEach(ind -> System.out.println(ind + " " + dis[ind]));
            relax();
        }

        /*for(int i=1; i<=n; i++){
            System.out.println(i + " " + dis[i]);
        }*/
        System.out.println(dis[n]);
    }

    private static void relax(){
        for(int i=0; i<m; i++){
            if(dis[edges[i].u] != max){
                if(dis[edges[i].v] == max) dis[edges[i].v] = dis[edges[i].u] + edges[i].z;
                else dis[edges[i].v] = Math.max(dis[edges[i].v], dis[edges[i].u] + edges[i].z);
            }
        }
    }
}

class Node11445 {
    int u,v,z;
    public Node11445(int u, int v, int z){
        this.u = u;
        this.v = v;
        this.z = z;
    }
}