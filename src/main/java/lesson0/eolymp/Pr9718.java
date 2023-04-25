package lesson0.eolymp;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Pr9718 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String surname;
        int salary;
        Map<String, Integer> map = new HashMap<>();
        for(int i=1; i<=n; i++){
            surname = in.next();
            salary = in.nextInt();
            map.put(surname, salary);
        }
        int q = in.nextInt();
        for(int i=1; i<=q; i++){
            surname = in.next();
            System.out.println(map.getOrDefault(surname, -1));
        }
    }
}
