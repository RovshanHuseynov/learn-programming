package lesson0.recursion;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        /*Fibonacci fibo = new Fibonacci();
        System.out.println(fibo.fibonacci(0));
        System.out.println(fibo.fibonacci(1));
        System.out.println(fibo.fibonacci(2));
        System.out.println(fibo.fibonacci(3));
        System.out.println(fibo.fibonacci(4));
        System.out.println(fibo.fibonacci(5));
        System.out.println(fibo.fibonacci(10));
        System.out.println(fibo.fibonacci(30));
        System.out.println(fibo.fibonacci(35));
        System.out.println(fibo.fibonacci(40));
        System.out.println(fibo.fibonacci(45));
        System.out.println(fibo.fibonacci(-10));*/

        Factorial f = new Factorial();
        //System.out.println(f.factorialRecursion(-10));
        System.out.println("Factorial 1: " + f.factorialRecursion(new BigInteger("1")));
        System.out.println("Factorial 5: " + f.factorialRecursion(new BigInteger("5")));
        System.out.println("Factorial 20: " + f.factorialRecursion(new BigInteger("20")));
        System.out.println("Factorial 50: " + f.factorialRecursion(new BigInteger("50")));
        System.out.println("Factorial 200: " + f.factorialRecursion(new BigInteger("200")));
        System.out.println("Factorial 1000: " + f.factorialRecursion(new BigInteger("1000")));
        System.out.println("Factorial 5000: " + f.factorialRecursion(new BigInteger("5000")));
    }
}
