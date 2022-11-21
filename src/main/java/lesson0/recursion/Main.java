package lesson0.recursion;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        System.out.println("Factorial 5: " + f.fibo(5));
        System.out.println("Factorial 10: " + f.fibo(20));
        System.out.println("Factorial 35: " + f.fibo(35));
        //System.out.println("Factorial 45: " + f.fibo(45));    // so much time
        System.out.println("------------------------------------");
        System.out.println("Factorial Memoized 5: " + f.fiboMemo(5));
        System.out.println("Factorial Memoized 10: " + f.fiboMemo(20));
        System.out.println("Factorial Memoized 35: " + f.fiboMemo(35));
        System.out.println("Factorial Memoized 45: " + f.fiboMemo(45));
        System.out.println("Factorial Memoized 100: " + f.fiboMemo(100));
        System.out.println("Factorial Memoized 1000: " + f.fiboMemo(1000));
        //System.out.println("Factorial Memoized 10000: " + f.fiboMemo(10000)); // StackOverflowError

        /*Factorial f = new Factorial();
        System.out.println("Factorial 1: " + f.factorialRecursion(new BigInteger("1")));
        System.out.println("Factorial 5: " + f.factorialRecursion(new BigInteger("5")));
        System.out.println("Factorial 20: " + f.factorialRecursion(new BigInteger("20")));
        System.out.println("Factorial 50: " + f.factorialRecursion(new BigInteger("50")));
        System.out.println("Factorial 200: " + f.factorialRecursion(new BigInteger("200")));
        System.out.println("Factorial 1000: " + f.factorialRecursion(new BigInteger("1000")));
        System.out.println("Factorial 5000: " + f.factorialRecursion(new BigInteger("5000")));*/
    }
}
