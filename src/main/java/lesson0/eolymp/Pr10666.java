package lesson0.eolymp;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Pr10666 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input;
        int score;
        Map<String, Integer> map = new HashMap<>();
        while(in.hasNext()){
            input = in.next();
            score = in.nextInt();
            map.put(input, map.getOrDefault(input, 0) + score);
        }

        map.keySet().stream().sorted().forEach(value -> System.out.println(value + " " + map.get(value)));
    }
}
