package lesson0.eolymp;

import java.util.*;

public class Pr10082 {
    static int n, m, s, d;
    static boolean [] used;
    static int [] dis;
    static List<List<Integer>> a;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        s = in.nextInt();
        d = in.nextInt();

        a = new ArrayList<>(n+1);
        used = new boolean[n+1];
        dis = new int[n+1];
        for(int i=0; i<=n; i++){
            a.add(new ArrayList<>());
        }

        int u,v;
        for(int i=1; i<=m; i++){
            u = in.nextInt();
            v = in.nextInt();
            a.get(u).add(v);
            a.get(v).add(u);
        }
        bsf();
        for(int i=1; i<=n; i++){
            System.out.print(dis[i] + " ");
        }
        System.out.println();
    }

    static void bsf(){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(s);
        used[s] = true;
        dis[s] = 0;
        int from, to, len;

        while(!queue.isEmpty()){
            from = queue.poll();
            len = a.get(from).size();
            for(int i=0; i<len; i++){
                to = a.get(from).get(i);
                if(!used[to]){
                    used[to] = true;
                    dis[to] = dis[from]+1;
                    queue.add(to);
                }
            }
        }
    }
}
