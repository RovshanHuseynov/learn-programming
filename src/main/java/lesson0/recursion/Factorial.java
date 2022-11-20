package lesson0.recursion;

import java.util.HashMap;
import java.util.Map;

public class Factorial {
    Map<Integer, Integer> memoization = new HashMap<>();

    public long factorialRecursion(long n){
        if(n < 0) throw new IllegalStateException("input value must be a positive integer");
        if(n == 0 || n == 1) return 1;
        return n * factorialRecursion(n - 1);
    }
}
