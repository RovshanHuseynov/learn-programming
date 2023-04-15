package lesson0.eolymp;

import java.util.Scanner;

public class Pr9649 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        Fraction9649 fraction = new Fraction9649(new MyLong9649(a), new MyLong9649(b));
        System.out.println(fraction.toString());
    }
}

class MyLong9649 {
    private long a;
    MyLong9649(long a){
        this.a = a;
    }
    public String toString(){
        return String.valueOf(a);
    }
}

class Fraction9649 {
    MyLong9649 numerator, denominator;
    public Fraction9649(){
    }
    public Fraction9649(MyLong9649 numerator, MyLong9649 denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public String toString(){
        return numerator + "/" + denominator;
    }
}