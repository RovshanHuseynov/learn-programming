package lesson0.eolymp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pr2270 {
    static boolean [] used;
    static int n;
    static List<List<Integer>> a;
    private static void dfs(int from){
        used[from] = true;
        int len = a.get(from).size(), to;
        for(int i=0; i<len; i++){
            to = a.get(from).get(i);
            if(!used[to]){
                dfs(to);
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int m = in.nextInt();
        a = new ArrayList<>(n+1);
        for(int i=0; i<=n; i++){
            a.add(new ArrayList<>());
        }
        int x,y;
        for(int i=0; i<m; i++){
            x = in.nextInt();
            y = in.nextInt();
            a.get(x).add(y);
        }
        dfs(1);
    }
}
