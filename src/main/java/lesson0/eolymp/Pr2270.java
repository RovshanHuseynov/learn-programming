package lesson0.eolymp;

import java.util.ArrayList;
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
public class Pr2270 {
    static boolean [] used;
    static int n;
    static List<List<Integer>> a;
    static int [] parent;
    static int [] dest;
    private static boolean dfs(int from){
        used[from] = true;
        int len = a.get(from).size(), to;
        if(len == 0) {
            parent[from] = from;
            dest[from] = from;
        }
        for(int i=0; i<len; i++){
            to = a.get(from).get(i);
            if(!used[to]){
                parent[to] = parent[from];
                dest[from] = to;
                boolean cycle = dfs(to);
                if(cycle) {
                    return true;
                }
            }
            else if(parent[from] == parent[to]){
                System.out.println("YES");
                System.out.print(to + " ");
                while(true){
                    System.out.print(dest[to] + " ");
                    to = dest[to];

                    if(to == from)break;
                }
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
        dest = new int[n+1];
        for(int i=0; i<=n; i++){
            a.add(new ArrayList<>());
            parent[i] = i;
            dest[i] = i;
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
