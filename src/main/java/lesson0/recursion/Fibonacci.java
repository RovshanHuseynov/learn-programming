package lesson0.recursion;

public class Fibonacci {
    public int fibonacci(int n){
        if(n == 0 || n == 1) {
            System.out.println("------------------------");
            return 1;
        }
        System.out.println(n);
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
