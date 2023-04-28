package lesson0.eolymp;

import java.util.*;
import java.util.stream.IntStream;

public class Pr10050 {
    static List<List<Path10050>> a;
    static int n;
    static long [] dis;
    static boolean [] used;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        a = new ArrayList<>(n+1);
        int u,v,w;
        for(int i=0; i<=n; i++){
            a.add(new ArrayList<>());
        }
        for(int i=1; i<n; i++){
            u = in.nextInt();
            v = in.nextInt();
            w = in.nextInt();
            a.get(u).add(new Path10050(v,w));
            a.get(v).add(new Path10050(u,w));
        }

        bfs(1);
        int maxIndex = IntStream.rangeClosed(1, n)
                .reduce((i, j) -> dis[i] > dis[j] ? i : j)
                .orElse(0);

        bfs(maxIndex);
        System.out.println(Arrays.stream(dis)
                .max()
                .orElse(0));
    }

    private static void bfs(int start){
        dis = new long[n+1];
        used = new boolean[n+1];

        Queue<Integer> queue = new LinkedList<>();
        used[start] = true;
        queue.add(start);

        while(!queue.isEmpty()){
            int from = queue.poll();
            int len = a.get(from).size();
            int to;
            long w;

            for(int i=0; i<len; i++){
                to = a.get(from).get(i).to;
                w = a.get(from).get(i).w;

                if(!used[to]){
                    queue.add(to);
                    used[to] = true;
                    dis[to] = Math.max(dis[to], dis[from] + w);
                }
            }
        }
    }
}

class Path10050 {
    int to;
    long w;
    public Path10050(int to, long w){
        this.to = to;
        this.w = w;
    }
}