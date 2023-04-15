package lesson0.eolymp;

import java.util.Scanner;

public class Pr9651 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        Fraction9651 fraction = new Fraction9651(s);
        System.out.println(fraction.Sum());
    }
}

class MyLong9651 {
    private long a;
    MyLong9651(long a){
        this.a = a;
    }
    public String toString(){
        return String.valueOf(a);
    }
    public long GetValue(){
        return a;
    }
}

class Fraction9651 {
    MyLong9651 numerator, denominator;
    public Fraction9651(String s){
        this.numerator = new MyLong9651(Long.parseLong(s.split("/")[0]));
        this.denominator = new MyLong9651(Long.parseLong(s.split("/")[1]));
    }
    public MyLong9651 GetNumerator(){
        return numerator;
    }

    public MyLong9651 GetDenominator(){
        return denominator;
    }

    public MyLong9651 Sum(){
        return new MyLong9651(numerator.GetValue() + denominator.GetValue());
    }
}