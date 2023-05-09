package lesson0.eolymp;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Pr1746 {
    static char [][] a;
    static boolean [][] used;
    static int [][] dis;
    static int n,m;
    static Pair1746 start, finish;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        String input;
        int len;
        a = new char[n+1][m+1];
        dis = new int[n+1][m+1];
        used = new boolean[n+1][m+1];
        in.nextLine();
        for(int i=1; i<=n; i++){
            input = in.nextLine();
            len = input.length();
            for(int j=0; j<len; j++){
                a[i][j+1] = input.charAt(j);

                if(a[i][j+1] == 'S'){
                    start = new Pair1746(i, j+1);
                } else if(a[i][j+1] == 'F'){
                    finish = new Pair1746(i, j+1);
                }
            }
        }

        bfs();

        /*for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                System.out.print(dis[i][j] + " ");
            }
            System.out.println();
        }*/

        if(used[finish.i][finish.j]) System.out.println(dis[finish.i][finish.j]);
        else System.out.println("-1");
    }

    private static void bfs(){
        Queue<Pair1746> queue = new LinkedList<>();
        queue.add(start);
        used[start.i][start.j] = true;
        Pair1746 from, to;

        while(!queue.isEmpty()){
            from = queue.poll();

            if(used[finish.i][finish.j]) break;
            to = from;
            while(true){  // asagi
                to = new Pair1746(to.i+1, to.j);

                if(to.i > n || a[to.i][to.j] == 'P' || used[to.i][to.j]){
                    break;
                }

                dis[to.i][to.j] = dis[from.i][from.j] + 1;
                used[to.i][to.j] = true;
                queue.add(to);

                if(a[to.i][to.j] == 'F') break;
            }

            if(used[finish.i][finish.j]) break;
            to = from;
            while(true){  // sola
                to = new Pair1746(to.i, to.j-1);

                if(to.j < 1 || a[to.i][to.j] == 'P' || used[to.i][to.j]){
                    break;
                }

                dis[to.i][to.j] = dis[from.i][from.j] + 1;
                used[to.i][to.j] = true;
                queue.add(to);

                if(a[to.i][to.j] == 'F') break;
            }

            if(used[finish.i][finish.j]) break;
            to = from;
            while(true){  // yuxari
                to = new Pair1746(to.i-1, to.j);

                if(to.i < 1 || a[to.i][to.j] == 'P' || used[to.i][to.j]){
                    break;
                }

                dis[to.i][to.j] = dis[from.i][from.j] + 1;
                used[to.i][to.j] = true;
                queue.add(to);

                if(a[to.i][to.j] == 'F') break;
            }

            if(used[finish.i][finish.j]) break;
            to = from;
            while(true){  // saga
                to = new Pair1746(to.i, to.j+1);

                if(to.j > m || a[to.i][to.j] == 'P' || used[to.i][to.j]){
                    break;
                }

                dis[to.i][to.j] = dis[from.i][from.j] + 1;
                used[to.i][to.j] = true;
                queue.add(to);

                if(a[to.i][to.j] == 'F') break;
            }
        }
    }
}

class Pair1746 {
    int i,j;
    public Pair1746(int i, int j){
        this.i = i;
        this.j = j;
    }
}