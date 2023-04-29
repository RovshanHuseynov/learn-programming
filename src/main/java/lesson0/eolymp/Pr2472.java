package lesson0.eolymp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pr2472 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int op,from,to;
        List<List<Integer>> a;
        a = new ArrayList<>(n+1);
        for(int i=0; i<=n; i++){
            a.add(new ArrayList<>());
        }
        for(int i=1; i<=k; i++){
            op = in.nextInt();
            if(op == 1){
                from = in.nextInt();
                to = in.nextInt();
                a.get(from).add(to);
                a.get(to).add(from);
            } else{
                from = in.nextInt();
                a.get(from).forEach(val -> System.out.print(val + " "));
                System.out.println();
            }
        }
    }
}
