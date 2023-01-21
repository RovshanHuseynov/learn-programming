package lesson0.graph;

import java.util.Scanner;
import java.util.Stack;

public class DFS {
    // source: https://www.youtube.com/watch?v=pcKY4hjDrxk
    /*
    Depth-first search is an algorithm for traversing or searching tree or graph data structures.
    The algorithm starts at the root node (selecting some arbitrary node as the root node in the
    case of a graph) and explores as far as possible along each branch before backtracking.
     */
    /*
    example1:
    7 6
    1 4
    1 5
    1 2
    2 7
    2 6
    2 3
    */
    /*
    10 13
    1 4
    3 4
    3 10
    1 2
    2 3
    3 9
    5 6
    2 5
    2 8
    2 7
    5 8
    5 7
    7 8
    */
    static int[][] arr;
    static boolean[] used;
    static int n,m;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        arr = new int[n+1][n+1];
        used = new boolean[n+1];
        for(int i=0; i<m; i++){
            int x = in.nextInt();
            int y = in.nextInt();
            arr[x][y] = 1;
            arr[y][x] = 1;
        }
        dfsWithStack();
        System.out.println();

        for(int i=1; i<=n; i++){
            used[i] = false;
        }
        dfsRecursion(1);
    }

    public static void dfsWithStack(){
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        used[1] = true;

        while (!stack.isEmpty()){
            int from = stack.pop();
            System.out.print(from + " ");

            for(int to=1; to<=n; to++){
                if(!used[to] && arr[from][to] == 1){
                    stack.push(to);
                    used[to] = true;
                }
            }
        }
    }

    public static void dfsRecursion(int from){
        System.out.print(from + " ");
        used[from] = true;

        for(int to=1; to<=n; to++){
            if(!used[to] && arr[from][to] == 1){
                dfsRecursion(to);
            }
        }
    }
}
