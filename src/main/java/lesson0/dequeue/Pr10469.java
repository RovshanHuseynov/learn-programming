package lesson0.dequeue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Pr10469 {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        Scanner in = new Scanner(System.in);
        String command1, command2;
        int val, cnt = 0;
        while(in.hasNext()){
            command1 = in.next();
            command2 = in.next();
            if(command1.equals("push") && command2.equals("front")){
                val = in.nextInt();
                if(val % 2 == 0) cnt++;
                deque.addFirst(val);
            } else if(command1.equals("push") && command2.equals("back")){
                val = in.nextInt();
                if(val % 2 == 0) cnt++;
                deque.addLast(val);
            } else if(command1.equals("pop") && command2.equals("front")){
                val = deque.getFirst();
                if(val % 2 == 0) cnt--;
                deque.removeFirst();
            } else if(command1.equals("pop") && command2.equals("back")){
                val = deque.getLast();
                if(val % 2 == 0) cnt--;
                deque.removeLast();
            }
        }
        System.out.println(cnt);
        // Ctrl + D to stop
    }
}
/*
push back 7
push back 5
pop front
push front 2
push back 1
 */