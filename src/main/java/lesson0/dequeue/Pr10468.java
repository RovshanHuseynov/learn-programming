package lesson0.dequeue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Pr10468 {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        Scanner in = new Scanner(System.in);
        String command1, command2;
        int val, sum = 0;
        while(in.hasNext()){
            command1 = in.next();
            command2 = in.next();
            if(command1.equals("push") && command2.equals("front")){
                val = in.nextInt();
                if(val % 2 == 1) sum += val;
                deque.addFirst(val);
            } else if(command1.equals("push") && command2.equals("back")){
                val = in.nextInt();
                if(val % 2 == 1) sum += val;
                deque.addLast(val);
            } else if(command1.equals("pop") && command2.equals("front")){
                val = deque.getFirst();
                if(val % 2 == 1) sum -= val;
                deque.removeFirst();
            } else if(command1.equals("pop") && command2.equals("back")){
                val = deque.getLast();
                if(val % 2 == 1) sum -= val;
                deque.removeLast();
            }
        }
        System.out.println(sum);
    }
}
/*
push back 7
push back 5
pop front
push front 2
push back 1
 */