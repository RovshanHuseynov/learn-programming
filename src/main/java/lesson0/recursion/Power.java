package lesson0.recursion;

public class Power {
    public int power(int a, int n){
        if(n == 1) return a;
        return a * power(a, n-1);
    }
}
