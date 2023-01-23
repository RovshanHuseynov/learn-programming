package lesson0.eolymp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Pr11296 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> inputList = new ArrayList<>();
        List<Integer> answerList = new ArrayList<>();

        for(int i=0; i<n; i++) inputList.add(in.nextInt());

        inputList.stream().filter(i -> i>0).sorted(Comparator.reverseOrder()).forEach(answerList::add);
        inputList.stream().filter(i -> i<0).sorted().forEach(answerList::add);
        inputList.stream().filter(i -> i==0).sorted().forEach(answerList::add);

        for(int i=0; i<answerList.size()-1; i++) System.out.print(answerList.get(i)+" ");
        System.out.println(answerList.get(answerList.size()-1));
    }
}
