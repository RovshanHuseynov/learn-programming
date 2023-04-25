package lesson0.eolymp;

import java.util.*;
import java.util.stream.Collectors;

public class Pr9720 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<String, List<String>> subjects = new HashMap<>();
        Map<String, List<String>> students = new HashMap<>();
        List<String> l;
        int n = in.nextInt();
        String input, subject, student;
        in.nextLine();
        for(int i=1; i<=n; i++){
            input = in.nextLine();
            subject = input.split(" ")[0];
            student = input.split(" ")[1];
            l = subjects.getOrDefault(subject, new ArrayList<>());
            l.add(student);
            subjects.put(subject, l);
            l = students.getOrDefault(student, new ArrayList<>());
            l.add(subject);
            students.put(student, l);
        }

        int q = in.nextInt();
        in.nextLine();
        for(int i=1; i<=q; i++){
            input = in.nextLine();
            if(subjects.containsKey(input)) {
                subjects.get(input).stream().sorted().forEach(val -> System.out.print(val + " "));
                System.out.println();
            }
            else {
                students.get(input).stream().sorted().forEach(val -> System.out.print(val + " "));
                System.out.println();
            }
        }
    }
}
