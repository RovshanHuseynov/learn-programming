package lesson0.eolymp;

import java.util.Scanner;

public class Pr9714 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    }
}

abstract class Shape9714 {
    int a, b;
    public Shape9714(int a, int b){this.a = a; this.b = b;}
    abstract int Perimeter();
    abstract double Area();
}

class Rectangle9714 extends Shape9714 {
    public Rectangle9714(int a, int b) { super(a,b);}
    public int Perimeter(){ return 2*(a+b);}
    public double Area(){ return a*b;}
}

class Square9714 extends Rectangle9714 {
    public Square9714(int a) { super(a,a);}
}

class Triangle9714 extends Shape9714 {
    int c;
    public Triangle9714(int a, int b, int c){ super(a,b); this.c = c; }
    public int Perimeter(){ return a+b+c;}
    public double Area(){
        double s = (a+b+c)/2.0;
        return Math.sqrt(s * (s-a) * (s-b) * (s-c));
    }
}