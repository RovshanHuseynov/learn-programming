package lesson0.eolymp;

import java.util.*;

public class Pr10056 {
    static int n,s,d;
    static List<List<Pair2>> a;
    static int [] dis;
    public static void main(String[] args) {
        int MAX = Integer.MAX_VALUE;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int m = in.nextInt();
        s = in.nextInt();
        d = in.nextInt();
        a = new ArrayList<>(n+1);
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
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(s);
        dis[s] = 0;
        int from,to,len;

        while(!deque.isEmpty()){
            from = deque.pollFirst();
            len = a.get(from).size();
            for (int i = 0; i < len; i++) {
                to = a.get(from).get(i).to;

                if(dis[to] > dis[from] + a.get(from).get(i).z) {
                    dis[to] = Math.min(dis[to], dis[from] + a.get(from).get(i).z);

                    if (a.get(from).get(i).z == 0)
                        deque.addFirst(to);
                    else
                        deque.addLast(to);
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
