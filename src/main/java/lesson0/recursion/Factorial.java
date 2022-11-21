package lesson0.recursion;

import java.math.BigInteger;

public class Factorial {
    public BigInteger factorialRecursion(BigInteger n){
        if(n.equals(BigInteger.ZERO)) return BigInteger.ONE;
        return n.multiply(factorialRecursion(n.subtract(BigInteger.ONE)));
    }
}
