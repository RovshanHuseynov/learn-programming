package lesson0.eolymp;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Pr8173 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int n,k;
        for(int i=1; i<=t; i++){
            n = in.nextInt();
            Map<Integer, Integer> map = new HashMap<>();
            for(int j=1; j<=n; j++){
                k = in.nextInt();
                map.put(k, map.getOrDefault(k,0) + 1);
            }
            int max = map.keySet()
                    .stream()
                    .reduce((o1,o2) -> Math.max(map.get(o1), map.get(o2)))
                    .orElse(0);
            //System.out.println(max);

            System.out.println(map.keySet()
                    .stream()
                    .filter(val -> map.get(val) == max)
                    .min((Comparator.comparingInt(o -> o)))
                    .orElse(0));
        }
    }
}
