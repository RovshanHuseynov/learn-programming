package lesson0.eolymp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Pr625 {
    static List<List<Pairr>> a;
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
        a = new ArrayList<>(n+1);
        dis = new int[n+1];
        parent = new int[n+1];
        used = new boolean[n+1];
        for(int i=0; i<=n; i++){
            dis[i] = MAX;
            parent[i] = i;
            a.add(new ArrayList<>());
        }

        int u,v,z;
        for(int i=1; i<=m; i++){
            u = in.nextInt();
            v = in.nextInt();
            z = in.nextInt();
            a.get(u).add(new Pairr(v,z));
            a.get(v).add(new Pairr(u,z));
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
        int to,len = a.get(from).size();
        used[from] = true;
        for(int i=0; i<len; i++){
            to = a.get(from).get(i).to;
            if(!used[to] && dis[to] > dis[from] + a.get(from).get(i).z){
                dis[to] = dis[from] + a.get(from).get(i).z;
                parent[to] = from;
            }
        }
    }
}

class Pairr {
    int to,z;

    public Pairr(int to, int z){
        this.to = to;
        this.z = z;
    }
}
