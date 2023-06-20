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
        boolean exitI = false, exitJ = false, queue = false;

        while(i < j){
            if(input.get(j) - input.get(i) > ans) ans = input.get(j) - input.get(i);
            if(input.get(i+1) < input.get(i)) i++;
            if(i < j && input.get(j) - input.get(i) > ans) ans = input.get(j) - input.get(i);
            if(input.get(j-1) > input.get(j)) j--;
            if(i < j && input.get(j) - input.get(i) > ans) ans = input.get(j) - input.get(i);

            if(exitI && exitJ) break;
            else if(queue) {
                i++;
                queue = false;
                if(i == n) exitI = true;
            }
            else {
                j--;
                queue = true;
                if(j == 0) exitJ = true;
            }
        }
        System.out.println(ans);
    }
}
