package lesson0.recursion;

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
        System.out.println(f.factorialRecursion(1));
        System.out.println(f.factorialRecursion(3));
        System.out.println(f.factorialRecursion(4));
        System.out.println(f.factorialRecursion(20));
        System.out.println(f.factorialRecursion(50));
        System.out.println(f.factorialRecursion(100));
        System.out.println(f.factorialRecursion(500));
    }
}
