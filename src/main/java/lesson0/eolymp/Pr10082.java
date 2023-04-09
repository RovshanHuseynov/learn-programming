package lesson0.eolymp;

import java.util.*;

public class Pr10082 {
    static int n, m, s, d;
    static int [] dis;
    static List<List<Integer>> a;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        s = in.nextInt();
        d = in.nextInt();
        n = 2 * n;
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
            a.get(2*u).add(2*v-1);
            a.get(2*v-1).add(2*u);
            a.get(2*v).add(2*u-1);
            a.get(2*u-1).add(2*v);
        }

        bsf(2*s-1);
        /*for(int i=1; i<=n; i++){
            System.out.print(dis[i] + " ");
        }
        System.out.println();*/

        System.out.println(dis[2*d-1]);
    }

    static void bsf(int start){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        dis[start] = 0;
        int from,to,len;

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
