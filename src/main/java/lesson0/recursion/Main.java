package lesson0.recursion;

public class Main {
    // source: https://www.youtube.com/watch?v=vYquumk4nWw
    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        /*System.out.println("Factorial 5: " + f.fibo(5));
        System.out.println("Factorial 10: " + f.fibo(20));
        System.out.println("Factorial 35: " + f.fibo(35));
        System.out.println("Factorial 45: " + f.fibo(45));    // so much time
        System.out.println("------------------------------------");
        System.out.println("Factorial Memoized 5: " + f.fiboMemo(5));
        System.out.println("Factorial Memoized 20: " + f.fiboMemo(20));
        System.out.println("Factorial Memoized 20: " + f.fiboMemo(20));
        System.out.println("Factorial Memoized 35: " + f.fiboMemo(35));
        System.out.println("Factorial Memoized 45: " + f.fiboMemo(45));
        System.out.println("Factorial Memoized 100: " + f.fiboMemo(100));
        System.out.println("Factorial Memoized 1000: " + f.fiboMemo(1000));
        System.out.println("Factorial Memoized 10000: " + f.fiboMemo(10000)); // StackOverflowError*/
        System.out.println("------------------------------------");
        System.out.println("Factorial bottom up 3: " + f.fiboBottomUp(3));
        System.out.println("Factorial bottom up 8: " + f.fiboBottomUp(8));
        System.out.println("Factorial bottom up 7: " + f.fiboBottomUp(7));
        System.out.println("Factorial bottom up 20: " + f.fiboBottomUp(20));

        /*System.out.println("------------------------------------");
        Factorial f = new Factorial();
        System.out.println("Factorial 1: " + f.factorialRecursion(1));
        System.out.println("Factorial 5: " + f.factorialRecursion(5));
        System.out.println("Factorial 20: " + f.factorialRecursion(20));
        System.out.println("Factorial 50: " + f.factorialRecursion(50));
        System.out.println("Factorial 200: " + f.factorialRecursion(200));
        System.out.println("Factorial 1000: " + f.factorialRecursion(1000));
        System.out.println("Factorial 5000: " + f.factorialRecursion(5000));*/

        /*System.out.println("------------------------------------");
        Power p = new Power();
        System.out.println(p.power(2,10));
        System.out.println(p.power(5,5));
        System.out.println(p.power(8,4));
        System.out.println(p.power(6,4));*/

        System.out.println("------------------------------------");
        TowerOfHanoi t = new TowerOfHanoi();
        t.TOH(3, 1,2,3);
        System.out.println("------------------------------------");
        System.out.println("TOH_count: " + t.TOH_count(25, 1,2,3));
    }
}
