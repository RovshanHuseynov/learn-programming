package lesson0.recursion;

public class Factorial {
    public int factorialRecursion(int n){
        if(n == 0) return 1;
        return n * (factorialRecursion(n - 1));
    }
}
