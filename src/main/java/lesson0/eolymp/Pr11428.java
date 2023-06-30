package lesson0.eolymp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Pr11428 {
    static int n;
    static List<List<Integer>>a;
    static boolean [] used;
    static long [] dis;
    static final long MAX = Long.MAX_VALUE;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        a = new ArrayList<>(n+1);
        for(int i=0; i<=n; i++){
            a.add(new ArrayList<>());
        }
        int u,v;
        for(int i=1; i<n; i++){
            u = in.nextInt();
            v = in.nextInt();
            a.get(u).add(v);
            a.get(v).add(u);
        }

        dfs(1);
        int one = getMax();
        dfs(one);
        int two = getMax();
        System.out.println(dis[two]);
    }

    static void dfs(int begin){
        dis = new long[n+1];
        used = new boolean[n+1];
        for(int i=0; i<=n; i++){
            dis[i] = MAX;
        }
        dis[begin] = 0;
        used[begin] = true;
        Stack<Integer> s = new Stack<>();
        s.add(begin);
        int from,len,to;

        while(!s.isEmpty()){
            from = s.pop();
            len = a.get(from).size();
            for(int i=0; i<len; i++){
                to = a.get(from).get(i);
                if(!used[to]){
                    //System.out.println(from + " " + to);
                    used[to] = true;
                    s.add(to);
                    dis[to] = Math.min(dis[to], dis[from] + 1);
                }
            }
        }
    }

    static int getMax(){
        long max = Long.MIN_VALUE;
        int maxInd = 1;
        for(int i=1; i<=n; i++){
            if(used[i] && dis[i] > max) {
                max = dis[i];
                maxInd = i;
            }
        }
        return maxInd;
    }
}
