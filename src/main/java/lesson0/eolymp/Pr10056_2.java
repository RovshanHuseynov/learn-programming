package lesson0.eolymp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pr10056_2 {
    static int n,s,d;
    static int MAX = Integer.MAX_VALUE;
    static List<List<Pair10056_2>> a;
    static boolean [] used;
    static int [] dis;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int m = in.nextInt();
        s = in.nextInt();
        d = in.nextInt();
        a = new ArrayList<>(n+1);
        used = new boolean[n+1];
        dis = new int[n+1];
        a.add(new ArrayList<>());
        for(int i=1; i<=n; i++){
            a.add(new ArrayList<>());
            dis[i] = MAX;
        }
        int u,v,z;
        for(int i=1; i<=m; i++){
            u = in.nextInt();
            v = in.nextInt();
            z = in.nextInt();
            a.get(u).add(new Pair10056_2(v,z));
            a.get(v).add(new Pair10056_2(u,z));
        }

        dis[s] = 0;
        dijkstra();

        /*for(int i=1; i<=n; i++){
            System.out.print(dis[i] + " ");
        }
        System.out.println();*/
        System.out.println(dis[d]);
    }

    static void relax(int from){
        used[from] = true;
        int to,len = a.get(from).size();
        for(int i=0; i<len; i++){
            to = a.get(from).get(i).to;
            if(dis[to] > dis[from] + a.get(from).get(i).z){
                dis[to] = dis[from] + a.get(from).get(i).z;
            }
        }
    }

    static void dijkstra(){
        int min, node;

        while(true) {
            min = MAX;
            node = -1;
            for (int i = 1; i <= n; i++) {
                if (!used[i] && dis[i] < min) {
                    min = dis[i];
                    node = i;
                }
            }

            if(node == -1) break;
            else relax(node);
        }
    }
}

class Pair10056_2 {
    int to,z;
    public Pair10056_2(int to, int z){
        this.to = to;
        this.z = z;
    }
}
