package lesson0.recursion;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Factorial {
    Map<Integer, Integer> memoization = new HashMap<>();

    public BigInteger factorialRecursion(BigInteger n){
        if(n.compareTo(BigInteger.ZERO) < 0)
            throw new IllegalStateException("input value must be a positive integer");
        if(n.equals(BigInteger.ZERO)) return BigInteger.ONE;
        return n.multiply(factorialRecursion(n.subtract(BigInteger.ONE)));
    }
}
