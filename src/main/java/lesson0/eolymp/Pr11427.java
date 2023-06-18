package lesson0.eolymp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pr11427 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int cur;
        List<Integer> list = new ArrayList<>(n+1);
        List<Integer> listMin = new ArrayList<>();
        List<Integer> listMax = new ArrayList<>();
        int min = 10000;
        for(int i=0; i<n; i++) {
            cur = in.nextInt();
            list.add(cur);
            if(cur < min){
                listMin.add(i);
                min = cur;
            }
        }
        int max = -10000;
        for(int i=n-1; i>=0; i--) {
            if(list.get(i) > max){
                listMax.add(i);
                max = list.get(i);
            }
        }
        list.forEach(i -> System.out.print(i + " "));
        System.out.println();
        listMax.forEach(i -> System.out.print(i + " "));
        System.out.println();
        listMin.forEach(i -> System.out.print(i + " "));
        System.out.println();

        int indMax = listMax.size()-1;
        int indMin = listMin.size()-1;
        while(indMin > 0){
            if(listMax.get(indMax) > listMin.get(indMin) && list.get(listMax.get(indMax)) > list.get(listMin.get(indMin))) break;
            indMin--;
        }
        System.out.println(indMax + " " + indMin);
        System.out.println(list.get(listMax.get(indMax)) - list.get(listMin.get(indMin)));
    }
}
