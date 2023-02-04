package lesson0.eolymp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pr3981 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<List<Integer>> arr = new ArrayList<>(n+1);
        for(int i=0; i<=n; i++) {
            arr.add(new ArrayList<>());
        }
        int x;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                x = in.nextInt();
                if(x == 1){
                    arr.get(i).add(j);
                }
            }
        }
        for(int i=1; i<=n; i++){
            System.out.print(arr.get(i).size() + " ");
            arr.get(i).forEach(val -> System.out.print(val + " "));
            System.out.println();
        }
    }
}
