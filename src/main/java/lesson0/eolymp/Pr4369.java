package lesson0.eolymp;

import java.util.*;

public class Pr4369 {
    static List<List<Integer>> a;
    static int n;
    static boolean [] used;
    static int [] dis;
    static Queue<Integer> queue;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int m = in.nextInt();
        used = new boolean[n+1];
        dis = new int[n+1];
        a = new ArrayList<>(n+1);
        for(int i=0; i<=n; i++){
            a.add(new ArrayList<>());
            dis[i] = -1;
        }
        int u,v;
        for(int i=1; i<=m; i++){
            u = in.nextInt();
            v = in.nextInt();
            a.get(u).add(v);
            a.get(v).add(u);
        }
        queue = new LinkedList<>();
        int k = in.nextInt();
        int val;
        for(int i=1; i<=k; i++){
            val = in.nextInt();
            queue.add(val);
            dis[val] = 0;
        }

        bfs();

        int ind = 1;
        for(int i=1; i<=n; i++){
            if(dis[i] > dis[ind]){
                ind = i;
            }
        }
        System.out.println(dis[ind]);
        System.out.println(ind);
    }

    private static void bfs(){
        int from,len,to;

        while(!queue.isEmpty()){
            from = queue.poll();
            len = a.get(from).size();
            for(int i=0; i<len; i++){
                to = a.get(from).get(i);
                if(dis[to] == -1){
                    dis[to] = dis[from] + 1;
                    queue.add(to);
                }
            }
        }
    }
}
