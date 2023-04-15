package lesson0.eolymp;

import java.util.Scanner;

public class Pr9650 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        Fraction9650 fraction = new Fraction9650(new MyLong9650(a), new MyLong9650(b));
        System.out.println(fraction.toString());
    }
}

class MyLong9650 {
    private long a;
    MyLong9650(long a){
        this.a = a;
    }
    public String toString(){
        return String.valueOf(a);
    }
    public MyLong9650 Abs(){
        return new MyLong9650(Math.abs(a));
    }
    public long GetValue(){
        return a;
    }
    public static long gcd(long a, long b){
        while (b!=0){
            a = a%b;
            a = b + a - (b=a);
        }
        return a;
    }
    public static MyLong9650 gcd(MyLong9650 a, MyLong9650 b){
        return new MyLong9650(gcd(a.Abs().GetValue(), b.Abs().GetValue()));
    }
    public MyLong9650 Divide(MyLong9650 a){
        return new MyLong9650(this.a/a.GetValue());
    }
}

class Fraction9650 {
    MyLong9650 numerator, denominator;
    public Fraction9650(){
    }
    public Fraction9650(MyLong9650 numerator, MyLong9650 denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public String toString(){
        Fraction9650 temp = Reduce();
        numerator = temp.numerator;
        denominator = temp.denominator;
        return numerator + "/" + denominator;
    }
    public Fraction9650 Reduce(){
        MyLong9650 ebob = MyLong9650.gcd(numerator, denominator);
        return new Fraction9650(numerator.Divide(ebob), denominator.Divide(ebob));
    }
}