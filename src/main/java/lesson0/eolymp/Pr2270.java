package lesson0.eolymp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pr2270 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        List<List<Integer>> a = new ArrayList<>(n+1);
        for(int i=0; i<=n; i++){
            a.add(new ArrayList<>());
        }
        int x,y;
        for(int i=0; i<m; i++){
            x = in.nextInt();
            y = in.nextInt();
            a.get(x).add(y);
        }
    }
}
