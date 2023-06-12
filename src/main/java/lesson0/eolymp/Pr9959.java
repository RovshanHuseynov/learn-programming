package lesson0.eolymp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Pr9959 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> ans = new ArrayList<>();
        int n = in.nextInt();
        int val;
        for(int i=0; i<n; i++){
            val = in.nextInt();
            if(val%5 == 0){
               ans.add(val);
            }
        }
        if(ans.size() == 0) System.out.println("NO");
        else {
            System.out.println(ans.size());
            Collections.reverse(ans);
            ans.forEach(a -> System.out.print(a + " "));
        }
    }
}
