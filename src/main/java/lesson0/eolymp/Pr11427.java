package lesson0.eolymp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pr11427 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> input = new ArrayList<>();
        int val;
        for(int i=0; i<n; i++){
            val = in.nextInt();
            input.add(val);
        }
        int ans = 0;
        int i=0, j=n-1;
        int max = -10000, min= 10000;
        boolean exitI = false, exitJ = false, queue = false, extra;

        while(i < j){
            extra = true;
            min = Math.min(min, input.get(i));
            max = Math.max(max, input.get(j));
            if(max - min > ans) ans = max - min;
            if(input.get(i+1) < input.get(i)) {
                i++;
                min = Math.min(min, input.get(i));
                extra = false;
            }
            if(i < j && max - min > ans) ans = max - min;
            if(input.get(j-1) > input.get(j)) {
                j--;
                max = Math.max(max, input.get(j));
                extra = false;
            }
            if(i < j && max - min > ans) ans = max - min;

            if(exitI && exitJ) break;
            else if(extra && queue) {
                i++;
                queue = false;
                if(i == n-1) exitI = true;
            }
            else if(extra){
                j--;
                queue = true;
                if(j == 0) exitJ = true;
            }
        }
        System.out.println(ans);
    }
}
