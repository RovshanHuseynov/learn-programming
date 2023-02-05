package lesson0.eolymp;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Pr9630 {
    public static void main(String[] args) {
        Testt test = new Testt();
        test.run();
    }
}

class Testt {
    Queue<Cell> queue;
    Scanner in;
    int n;
    int m;
    boolean[][] used;

    public void run() {
        in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        used = new boolean[n+1][n+1];

        for (int i = 0; i < m; i++) {
            queue = new LinkedList<>();
            bfs(new Cell(in.nextInt(), in.nextInt(), 0));
        }

        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            //System.out.println();
            for (int j = 1; j <= n; j++) {
                //System.out.print(used[i][j] + " ");
                if (!used[i][j]) cnt++;
            }
        }
        System.out.println(cnt);
    }

    private void bfs(Cell cell) {
        used[cell.i][cell.j] = true;
        queue.add(cell);

        while(!queue.isEmpty()){
            Cell top = queue.poll();

            if((top.direction == 0 || top.direction == 1) && top.i > 1 && top.j > 1){ queue.add(new Cell(top.i-1, top.j-1, 1)); used[top.i-1][top.j-1] = true; }
            if((top.direction == 0 || top.direction == 2) && top.i < n && top.j > 1){ queue.add(new Cell(top.i+1, top.j-1, 2)); used[top.i+1][top.j-1] = true; }
            if((top.direction == 0 || top.direction == 3) && top.i > 1 && top.j < n){ queue.add(new Cell(top.i-1, top.j+1, 3)); used[top.i-1][top.j+1] = true; }
            if((top.direction == 0 || top.direction == 4) && top.i < n && top.j < n){ queue.add(new Cell(top.i+1, top.j+1, 4)); used[top.i+1][top.j+1] = true; }
        }
    }
}

class Cell {
    int i, j, direction;

    public Cell(int i, int j, int direction) {
        this.i = i;
        this.j = j;
        this.direction = direction;
    }
}
