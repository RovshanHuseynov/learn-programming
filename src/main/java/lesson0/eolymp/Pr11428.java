package lesson0.eolymp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pr11428 {
    static int n;
    static List<List<Integer>>a;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        a = new ArrayList<>(n+1);
        for(int i=0; i<=n; i++){
            a.add(new ArrayList<>());
        }
        int u,v;
        for(int i=1; i<n; i++){
            u = in.nextInt();
            v = in.nextInt();
            System.out.println(u + " " + v);
            a.get(u).add(v);
            a.get(v).add(u);
        }
    }
}
