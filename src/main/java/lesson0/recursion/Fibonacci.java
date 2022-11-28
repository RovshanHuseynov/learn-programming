package lesson0.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fibonacci {
    List<Long> memoization = new ArrayList<>(Arrays.asList(0L, 1L, 1L));
    List<Long> bottomUp = new ArrayList<>(Arrays.asList(0L, 1L, 1L));

    public long fibo(int n){
        if(n == 1 || n == 2) return 1;
        return fibo(n - 1) + fibo(n - 2);
    }

    public long fiboMemo(int n){
        System.out.println(n + " " + memoization.toString());
        if(memoization.size() > n) return memoization.get(n);
        long result = fiboMemo(n - 1) + fiboMemo(n - 2);
        memoization.add(result);
        return result;
    }

    public long fiboBottomUp(int n){
        System.out.println("array in the beginning of finding " + n + "th fibo" + bottomUp.toString());
        if(n == 1 || n == 2) return bottomUp.get(n);
        else if(bottomUp.size() > n) return bottomUp.get(n);

        for(int i=bottomUp.size(); i<=n; i++){
            System.out.println(i + "th fibo = " + bottomUp.get(i-1) + " + " + bottomUp.get(i-2));
            bottomUp.add(bottomUp.get(i-1) + bottomUp.get(i-2));
        }
        System.out.println("array in the end of finding " + n + "th fibo" + bottomUp.toString());
        return bottomUp.get(n);
    }
}
