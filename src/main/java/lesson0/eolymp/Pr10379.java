package lesson0.eolymp;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Pr10379 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s;
        int val;
        Map<Integer, Integer> mapFreq = new HashMap<>();
        while(in.hasNext()){
            s = in.next();
            if(s.equals("push")){
                val = in.nextInt();
                if(mapFreq.containsKey(val)) {
                    mapFreq.put(val, mapFreq.get(val) + 1);
                } else {
                    mapFreq.put(val, 1);
                }
                // push
            } else {
                // pop
            }
        }
    }
}
