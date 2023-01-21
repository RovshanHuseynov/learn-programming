package lesson0.eolymp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pr10263 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Person> list = new ArrayList<>();

        for(int i=0; i<n; i++){
            list.add(new Person(in.next(), in.next(), in.nextInt()));
        }

        list.stream().sorted((o1, o2) -> {
            if(o1.surname.compareTo(o2.surname) != 0) return o1.surname.compareTo(o2.surname);
            else if(o1.name.compareTo(o2.name) != 0) return o1.name.compareTo(o2.name);
            return o2.year - o1.year;
        }).forEach(System.out::println);
    }
}

class Person {
    public String name;
    public String surname;
    public int year;

    public Person(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + year;
    }
}
