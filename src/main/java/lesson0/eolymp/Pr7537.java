package lesson0.eolymp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pr7537 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        List<Integer> list;
        for(int i=0; i<t; i++){
            int n = in.nextInt();
            int sum = 0;
            int max = 0;
            int index = -1;
            list = new ArrayList<>();
            for(int j=0; j<n; j++){
                int x = in.nextInt();
                list.add(x);
                sum += x;
                if(x > max) max = x;
            }

            for(int j=0; j<n; j++){
                if(list.get(j) == max) {
                    if(index == -1) index = j;
                    else {
                        index = -1;
                        break;
                    }
                }
            }

            if(index == -1) System.out.println("no winner");
            else if(max > sum / 2) System.out.println("majority winner " + (index+1));
            else System.out.println("minority winner " + (index+1));
        }
    }
}
