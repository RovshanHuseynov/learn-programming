package lesson0.eolymp;

import java.util.Scanner;

public class Pr10157 {
    static int n;
    static int [][] a;
    static int [] parent;
    //static boolean [] used;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        a = new int[n+1][n+1];
        parent = new int[n+1];
        //used = new boolean[n+1];
        int aa,bb;
        for(int i=1; i<=n; i++) {
            parent[i] = i;
        }

        while(in.hasNext()){
            aa = in.nextInt();
            bb = in.nextInt();
            a[aa][bb] = 1;
        }

        for(int i=1; i<=n; i++){
            //if(!used[i])
                dfs(i);
        }

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void dfs(int from){
        //used[from] = true;

        for(int to=1; to<=n; to++){
            if(//!used[to] &&
                    a[from][to] == 1){
                parent[to] = from;

                int temp = from;
                while (temp != parent[temp]) {
                    a[parent[temp]][to] = 1;
                    temp = parent[temp];
                }

                dfs(to);
            }
        }
    }
}
