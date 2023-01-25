package lesson0.eolymp;

import java.util.ArrayList;
import java.util.Scanner;

public class Pr776 {
    public static void main(String[] args) {
        Test a = new Test();
        a.calc();
    }
}

class Test {
    int n;
    ArrayList<ArrayList<Integer> > arr;
    boolean [] used;

    public void calc(){
        Scanner in = new Scanner(System.in);
        int x,y;
        n = in.nextShort();
        used = new boolean[n+1];
        arr = new ArrayList<ArrayList<Integer> >(n+1);

        for (int i = 0; i <= n; i++) {
            arr.add(new ArrayList<Integer>());
        }

        /*for(int i=0; i<m; i++){
            x = in.nextInt();
            y = in.nextInt();

            arr.get(x).add(y);
            arr.get(y).add(x);
        }*/

        int t;
        for(int i=1; i<=n; i++){
            //arr.add(new ArrayList<>(n+1));
            t = in.nextInt();
            for(int j=0; j<t; j++){
                arr.get(i).add(in.nextInt());
            }
        }

        int cnt = 0;

       /* for(int i=0; i<n; i++){
            System.out.print(i + "--> ");
            for(int j=0; j<arr.get(i).size(); j++){
                System.out.print(arr.get(i).get(j) + " ");
            }
            System.out.println();
        }
*/

        for(int i=1; i<=n; i++){
            if(!used[i]){
                dfs(i);
                cnt++;
            }
        }

        System.out.println(cnt);
    }

    public void dfs(int from){
        used[from] = true;
        int to;

        for(int i=0; i<arr.get(from).size(); i++){
            to = arr.get(from).get(i);
            if(!used[to]){
                dfs(to);
            }
        }
    }
}