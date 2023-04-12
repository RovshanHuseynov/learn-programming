package lesson0.eolymp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pr10505_2 {
    // https://www.geeksforgeeks.org/detect-cycle-in-a-graph/
    static int n;
    static List<List<Integer>> a;
    static boolean [] used;
    static boolean [] recursionStack;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int m,val;
        a = new ArrayList<>(n+1);
        a.add(new ArrayList<>());
        used = new boolean[n+1];
        recursionStack = new boolean[n+1];
        for(int i=1; i<=n; i++){
            a.add(new ArrayList<>());
            m = in.nextInt();
            for(int j=1; j<=m; j++){
                val = in.nextInt();
                a.get(i).add(val);
            }
        }

        System.out.println(isCyclic());
    }

    private static boolean isCyclicUtil(int from) {
        if (recursionStack[from]) return true;
        if (used[from]) return false;

        used[from] = true;
        recursionStack[from] = true;

        int len, to;
        len = a.get(from).size();
        for (int i = 0; i < len; i++) {
            to = a.get(from).get(i);
            if (isCyclicUtil(to)) {
                return true;
            }
        }
        recursionStack[from] = false;
        return false;
    }

    static int isCyclic() {
        int cnt = 0;
        for(int i=1; i<=n; i++){
            if(isCyclicUtil(i)){
                //return true;
                cnt++;
            }
        }
        //return false;
        return cnt;
    }
}
