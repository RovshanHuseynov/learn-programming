package lesson0.eolymp;

import java.util.*;

public class Pr1947 {
    static ArrayList< ArrayList<Integer> > g,gr;
    static boolean [] used;
    static int [] color;
    static Vector<Integer> top = new Vector<>();
    static TreeSet<Pair> s = new TreeSet<>();

    public static void dfs1(int from){
        used[from] = true;
        for(int i=0; i<g.get(from).size(); i++){
            int to = g.get(from).get(i);
            if(!used[to]) dfs1(to);
        }
        top.add(from);
    }

    public static void dfs2(int from, int c){
        color[from] = c;
        for(int i=0; i<gr.get(from).size(); i++){
            int to = gr.get(from).get(i);
            if(color[to] == -1) dfs2(to, c);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        g = new ArrayList<>(n+1);
        gr = new ArrayList<>(n+1);
        used = new boolean[n+1];
        color = new int[n+1];
        for(int i=0; i<=n; i++){
            g.add(new ArrayList<>());
            gr.add(new ArrayList<>());
        }
        int x,y;
        for(int i=0; i<m; i++){
            x = in.nextInt();
            y = in.nextInt();
            g.get(x).add(y);
            gr.get(y).add(x);
        }
        for(int i=1; i<=n; i++){
            if(!used[i]) dfs1(i);
        }
        Arrays.fill(color, -1);
        int c = 0;
        for(int i=1; i<=n; i++){
            int v = top.get(n-i);
            if(color[v] == -1) dfs2(v, c++);
        }

        for(int i=1; i<g.size(); i++){
            for(int j=0; j<g.get(i).size(); j++){
                int to = g.get(i).get(j);
                if(color[i] != color[to]) s.add(new Pair(color[i], color[j]));
            }
        }
        System.out.println(s.size());
    }
}

class Pair implements Comparable<Pair>
{
    int x, y;

    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Pair a) {
        if (x == a.x) return y - a.y;
        return x - a.x;
    }
}