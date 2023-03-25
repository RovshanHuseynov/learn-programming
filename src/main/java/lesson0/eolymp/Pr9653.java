package lesson0.eolymp;

import java.util.Scanner;

public class Pr9653 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    }
}

class MyDouble {
    private final double a;

    MyDouble(double a) {
        this.a = a;
    }

    public String toString() { // Print the variable of type MyLong
        //return String.valueOf(BigDecimal.valueOf(a).setScale(5, RoundingMode.HALF_UP).doubleValue());
        return String.valueOf(a);
    }
    public MyDouble Add(MyDouble b) {// Add the value of type MyDouble
        return new MyDouble(a + b.a);
    }
    public MyDouble Add(double b) {// Add the value of type double
        return Add(new MyDouble(b));
    }
    public MyDouble Sub(MyDouble b) {// Subtract the value of type MyDouble
        return new MyDouble(a - b.a);
    }
    public MyDouble Sub(double b) { // Subtract the value of type double
        return Sub(new MyDouble(b));
    }
    public MyDouble Mult(MyDouble b) {// Multiply by the value of type MyDouble
        return new MyDouble(a * b.a);
    }
    public MyDouble Mult(double b) { // Multiply by the value of type double
        return Mult(new MyDouble(b));
    }
    public MyDouble Div(MyDouble b) { // Divide by the value of type MyDouble
        return new MyDouble(a / b.a);
    }
    public MyDouble Div(double b) { // Divide by the value of type double
        return Div(new MyDouble(b));
    }
}
