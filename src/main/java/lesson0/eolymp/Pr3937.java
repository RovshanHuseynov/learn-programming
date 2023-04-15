package lesson0.eolymp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Pr3937 {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        List<Pair3937> l = new ArrayList<>();
        while (in.hasNextInt()){
            n = in.nextInt();
            l.add(new Pair3937(n, calculateRoot(n)));
        }

        l.stream().sorted(((o1, o2) -> {
            if(o1.root != o2.root){
                return o1.root - o2.root;
            }
            return o1.real - o2.real;
        })).forEach(val -> System.out.print(val.real + " "));
    }

    public static int calculateRoot(int n){
        int sum = sumOfDigits(n);
        while(String.valueOf(sum).length() > 1){
            sum = sumOfDigits(sum);
        }
        return sum;
    }

    public static int sumOfDigits(int n){
        return Stream.of(String.valueOf(n).split(""))
                .mapToInt(Integer::valueOf)
                .sum();
    }
}

class Pair3937 {
    int real;
    int root;
    public Pair3937(int real, int root){
        this.real = real;
        this.root = root;
    }
}
