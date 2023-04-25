package lesson0.eolymp;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Pr9719 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String surname;
        int salary;
        Map<String, Integer> map = new HashMap<>();
        while(in.hasNext()) {
            surname = in.next();
            salary = in.nextInt();
            map.put(surname, salary);
            //System.out.println(surname + " " + salary);
        }

        map.keySet()
                .stream()
                .sorted()
                .forEach(val -> System.out.println(val + " " + map.get(val)));
    }
}
