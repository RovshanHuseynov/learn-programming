package lesson0.eolymp;

import java.util.*;

public class Pr10056 {
    static int n,s,d;
    static List<List<Pair2>> a;
    static boolean [] used;
    static int [] dis;
    public static void main(String[] args) {
        int MAX = Integer.MAX_VALUE;
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
            a.get(u).add(new Pair2(v,z));
            a.get(v).add(new Pair2(u,z));
        }
        bfs();

        /*for(int i=1; i<=n; i++){
            System.out.print(dis[i] + " ");
        }
        System.out.println();*/
        System.out.println(dis[d]);
    }

    static void bfs(){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(s);
        used[s] = true;
        dis[s] = 0;
        int from,to,len;

        while(!queue.isEmpty()){
            from = queue.poll();
            len = a.get(from).size();
            for(int i=0; i<len; i++){
                to = a.get(from).get(i).to;
                if(!used[to]) {
                    used[to] = true;
                    dis[to] = Math.min(dis[to], dis[from] + a.get(from).get(i).z);
                    queue.add(to);
                }
            }
        }
    }
}

class Pair2 {
    int to,z;
    public Pair2(int to, int z){
        this.to = to;
        this.z = z;
    }
}
