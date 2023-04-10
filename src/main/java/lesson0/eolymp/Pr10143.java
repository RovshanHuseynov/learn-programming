package lesson0.eolymp;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Pr10143 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, top, top2, remain = 0;
        Queue<Integer> q;
        List<Integer> list;
        while(true){
            n = in.nextInt();
            if(n==0) break;
            q = new LinkedList<>();
            list = new LinkedList<>();
            System.out.print("Discarded cards: ");
            for(int i=1; i<=n; i+=2){
                System.out.print(i + ", ");
            }
            for(int i=2; i<=n; i+=2){
                q.add(i);
            }
            while(!q.isEmpty()){
                top = q.poll();
                if(q.isEmpty()){
                    remain = top;
                    break;
                }
                top2 = q.poll();
                list.add(top2);
                q.add(top);
            }
            for(int i=0; i<list.size()-1; i++){
                System.out.print(list.get(i) + ", ");
            }
            System.out.println(list.get(list.size()-1));
            System.out.println("Remaining card: " + remain);
        }
    }
}
