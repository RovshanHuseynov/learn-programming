package lesson0.eolymp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Pr10506 {
    static int n;
    static List<List<Integer>> arr;
    static Stack<Integer> stack = new Stack<>();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        boolean [] used = new boolean[n+1];
        int t;

        //System.out.println(n);
        //System.out.println(used.length);
        //System.out.println(arr.size());
        arr = new ArrayList<>(n+1);
        arr.add(new ArrayList<>(n+1));
        for(int i=1; i<=n; i++){
            arr.add(new ArrayList<>(n+1));
            t = in.nextInt();
            for(int j=0; j<t; j++){
                arr.get(i).add(in.nextInt());
            }
        }

        /*for(int i=0; i<=n; i++){
            System.out.println(i + "----------");
            System.out.println(arr.get(i).toString());
        }*/

        int count = 0;
        for(int i=1; i<=n; i++){
            if(!used[i]) {
                stack = new Stack<>();
                stack.push(i);
                used[i] = true;
                dfs(used);
                count++;
            }
        }
        System.out.println(count);
    }

    private static void dfs(boolean [] used){
        int from,to;

        while (!stack.empty()){
            from = stack.pop();
            for (int i = 0; i < arr.get(from).size(); i++) {
                to = arr.get(from).get(i);
                if (!used[to]) {
                    used[to] = true;
                    stack.push(to);
                }
            }
        }
    }
}
