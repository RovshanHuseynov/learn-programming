package lesson0.eolymp;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Pr11452 {
    static List<List<Integer>> a;
    static int n;
    static boolean [] used;
    static int [] dis;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        a = new ArrayList<>(n+1);
        used = new boolean[n+1];
        dis = new int[n+1];
        for(int i=0; i<=n; i++){
            a.add(new ArrayList<>());
        }
        int m = in.nextInt();
        int u,v;
        for(int i=1; i<=m; i++){
            u = in.nextInt();
            v = in.nextInt();
            a.get(u).add(v);
        }

        for(int i=1; i<=n; i++) {
            if(!used[i])
                dfs(i);
        }

        System.out.println(Arrays.stream(dis, 1, n).max().orElse(1));

        /*System.out.println(IntStream.rangeClosed(1,n)
                .reduce((i,j) -> Math.max(dis[i], dis[j])).orElse(1));*/
    }

    static void dfs(int from){
        used[from] = true;
        int to, len = a.get(from).size();

        for(int i=0; i<len; i++){
            to = a.get(from).get(i);
            if(!used[to]){
                dfs(to);
            }

            dis[from] = Math.max(dis[from], 1 + dis[to]);
        }
    }
}
