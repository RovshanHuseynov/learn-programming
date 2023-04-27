package lesson0.eolymp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Pr9654 {
    static int n,cnt;
    static Color9654 [] res;
    static int [][] a;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        res = new Color9654[n+1];
        a = new int[n+1][n+1];
        int x,y;
        while(in.hasNextInt()){
            x = in.nextInt();
            y = in.nextInt();
            a[x][y] = 1;
            a[y][x] = 1;
        }

        for(int i=1; i<=n; i++){
            res[i] = new Color9654();
        }


        for(int i=1; i<=n; i++){
            if(res[i].color == 0){
                dfs(i);
            }
        }

        List<Color9654> ans = new ArrayList<>();
        for(int i=1; i<=n; i++){
            ans.add(new Color9654(i, res[i].gray, res[i].black));
            //System.out.printf("Vertex: %d, Gray %d, Black %d\n", res[i].color, res[i].gray, res[i].black);
        }
        ans.stream()
                .sorted(Comparator.comparing(o -> o.gray))
                .forEach(val -> System.out.printf("Vertex: %d, Gray %d, Black %d\n", val.color, val.gray, val.black));
    }

    private static void dfs(int from){
        res[from].color = 1;
        res[from].gray = ++cnt;

        for(int i=1; i<=n; i++){
            if(a[from][i] == 1 && res[i].color == 0){
                dfs(i);
            }
        }

        res[from].color = 2;
        res[from].black = ++cnt;
    }
}

class Color9654 {
    int color, gray, black;

    public Color9654(int color, int gray, int black){
        this.color = color;
        this.gray = gray;
        this.black = black;
    }
    public Color9654(){
        this(0,0,0);
    }
}