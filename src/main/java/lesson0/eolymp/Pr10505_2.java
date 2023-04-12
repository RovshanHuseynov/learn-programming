package lesson0.eolymp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pr10505_2 {
    // https://codeforces.com/blog/entry/64903
    static int n;
    static List<List<Integer>> a;
    static int [] color;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int m,val;
        a = new ArrayList<>(n+1);
        a.add(new ArrayList<>());
        color = new int[n+1];
        for(int i=1; i<=n; i++){
            a.add(new ArrayList<>());
            m = in.nextInt();
            for(int j=1; j<=m; j++){
                val = in.nextInt();
                a.get(i).add(val);
            }
        }

        int sum = 0;
        for(int i=1; i<=n; i++){
            sum += dfs(i);
        }
        System.out.println(sum);
    }

    static int dfs(int from){
        int cnt = 0;
        color[from] = 1;

        int len = a.get(from).size(),to;
        for(int i=0; i<len; i++){
            to = a.get(from).get(i);
            if(color[to] == 0){
                dfs(to);
            } else if(color[to] == 1){
                cnt++;
                break;
            }
        }
        color[from] = 2;
        return cnt;
    }
}
