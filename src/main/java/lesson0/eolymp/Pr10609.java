package lesson0.eolymp;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Frequency {
    int count;
    int index;

    Frequency(int count, int index){
        this.count = count;
        this.index = index;
    }
}

public class Pr10609 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<Integer, Frequency> map = new HashMap<>();
        int n = in.nextInt();
        int k = in.nextInt();
        int val;
        for(int i=0; i<n; i++){
            val = in.nextInt();
            if(map.containsKey(val)){
                map.put(val, new Frequency(map.get(val).count + 1, map.get(val).index));
            }
            else{
                map.put(val, new Frequency(1, i));
            }
        }

        map.entrySet()
                .stream()
                .filter(value -> value.getValue().count == k)
                .min(Comparator.comparingInt(o -> o.getValue().index))
                .ifPresentOrElse((value) -> System.out.println(value.getKey()), () -> System.out.println("-1"));
    }
}
