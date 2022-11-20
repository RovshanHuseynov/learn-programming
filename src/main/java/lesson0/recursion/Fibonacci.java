package lesson0.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fibonacci {
    List<Long> memoization = new ArrayList<>(Arrays.asList(0L, 1L, 1L));

    public long fibo(int n){
        if(n == 1 || n == 2) return 1;
        return fibo(n - 1) + fibo(n - 2);
    }

    public long fiboMemo(int n){
        if(memoization.size() > n) return memoization.get(n);

        long result = fiboMemo(n - 1) + fiboMemo(n - 2);
        memoization.add(result);
        return result;
    }
}
