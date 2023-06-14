package lesson0.eolymp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pr8671 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> list = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        int cnt = 1;
        while(cnt*cnt <= n){
            list.add(cnt*cnt);
            cnt++;
        }
        //list.forEach(val -> System.out.print(val + " "));
        //System.out.println();

        for(int i=0; i<list.size()-1; i++){
            for(int j=i+1; j<list.size(); j++){
                if(list.get(i) + list.get(j) <= n)
                    ans.add(list.get(i) + list.get(j));
            }
        }
        ans.stream().sorted().forEach(val -> System.out.print(val + " "));
    }
}
