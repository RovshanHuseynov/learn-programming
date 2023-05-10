package lesson0.eolymp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Pr11453 {
    static List<List<Integer>> a;
    static boolean [] used;
    static int [] dis;
    static int n;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        a = new ArrayList<>(n+1);
        used = new boolean[n+1];
        for(int i=0; i<=n; i++){
            a.add(new ArrayList<>());
        }
        int m = in.nextInt();
        int aa,bb;
        for(int i=1; i<=m; i++){
            aa = in.nextInt();
            bb = in.nextInt();
            a.get(aa).add(bb);
            a.get(bb).add(aa);
        }

        int min = Integer.MAX_VALUE;
        int max = 0;

        for(int i=1; i<=n; i++){
            if(!used[i]){
                dis = new int[n+1];
                dis[i] = 1;
                dfs(i);

                min = Math.min(min, Arrays.stream(dis).filter(val -> val > 0)
                        .min()
                        .orElse(1));

                max = Math.max(max, Arrays.stream(dis).filter(val -> val > 0)
                        .max()
                        .orElse(1));
            }
        }

        System.out.println(min + " " + max);
    }

    private static void dfs(int from){
        used[from] = true;
        int to,len = a.get(from).size();

        for(int i=0; i<len; i++){
            to = a.get(from).get(i);
            if(!used[to]){
                dis[to] = dis[from] + 1;
                dfs(to);
            }
        }
    }
}
