package lesson0.eolymp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
6 6
1 3
2 4
3 4
1 2
3 5
3 6
 */
/*
7 7
1 3
2 4
3 4
1 2
3 5
3 6
4 7
 */
/*
7 8
1 3
2 4
3 4
1 2
3 5
3 6
4 7
7 2
 */
public class Pr2270 {
    static boolean [] used;
    static int n;
    static List<List<Integer>> a;
    static int [] parent;
    static int [] src;
    private static boolean dfs(int from){
        used[from] = true;
        int len = a.get(from).size(), to;
        if(len == 0) {
            //System.out.println("len=0 " + from + " " + parent[from]);
            while(parent[from] != from) {
                parent[from] = src[from];
                from = src[from];
            }
        }
        for(int i=0; i<len; i++){
            to = a.get(from).get(i);
            if(!used[to]){
                parent[to] = parent[from];
                src[to] = from;
                boolean cycle = dfs(to);
                if(cycle) {
                    return true;
                }
            }
            else if(parent[from] == parent[to]){
                System.out.println("YES");
                List<Integer> ans = new ArrayList<>();
                ans.add(from);
                while(from != to){
                    //System.out.print(src[from] + " ");
                    ans.add(src[from]);
                    from = src[from];
                }
                Collections.reverse(ans);
                ans.forEach(val -> System.out.print(val + " "));
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int m = in.nextInt();
        a = new ArrayList<>(n+1);
        parent = new int[n+1];
        used = new boolean[n+1];
        src = new int[n+1];
        for(int i=0; i<=n; i++){
            a.add(new ArrayList<>());
            parent[i] = i;
            src[i] = i;
        }
        int x,y;
        for(int i=0; i<m; i++){
            x = in.nextInt();
            y = in.nextInt();
            a.get(x).add(y);
        }

        boolean cycle = false;
        for(int i=1; i<=n; i++){
            if(!used[i]){
                cycle = dfs(i);
                if(cycle) break;
            }
        }

        if(!cycle) System.out.println("NO");
    }
}
