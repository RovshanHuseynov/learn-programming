package lesson0.recursion;

public class Main {
    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        System.out.println(f.fibonacci(0));
        System.out.println(f.fibonacci(1));
        System.out.println(f.fibonacci(2));
        System.out.println(f.fibonacci(3));
        System.out.println(f.fibonacci(4));
        System.out.println(f.fibonacci(5));
        System.out.println(f.fibonacci(10));
        System.out.println(f.fibonacci(30));
        System.out.println(f.fibonacci(35));
        System.out.println(f.fibonacci(40));
        System.out.println(f.fibonacci(45));
    }
}
