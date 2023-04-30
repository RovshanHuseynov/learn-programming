package lesson0.eolymp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Pr4854 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<List<Integer>> a = new ArrayList<>(n+1);
        List<List<Integer>> res = new ArrayList<>(n+1);
        for(int i=0; i<=n; i++){
            a.add(new ArrayList<>());
            res.add(new ArrayList<>());
        }
        in.nextLine();
        String s;
        for(int i=1; i<=n; i++){
            s = in.nextLine();
            if(s.length() == 0) continue;
            int finalI = i;
            Arrays.stream(s.split(" ")).forEach(val -> a.get(finalI).add(Integer.valueOf(val)));
            //System.out.println(a.get(i));
        }

        for(int i=1; i<=n; i++){
            int finalI = i;
            a.get(i).forEach(val-> res.get(val).add(finalI));
        }

        System.out.println(n);
        for(int i=1; i<=n; i++){
            res.get(i).forEach(j -> System.out.print(j + " "));
            System.out.println();
        }
    }
}
