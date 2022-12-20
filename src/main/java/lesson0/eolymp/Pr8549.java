package lesson0.eolymp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pr8549 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> primeList = new ArrayList<>();
        List<Integer> luckyNumbersList = new ArrayList<>();
        for(int i=1; i<=1000; i++){
            if(isPrime(i)) primeList.add(i);
        }
        //System.out.println(primeList.size());
        //System.out.println(primeList);

        int cnt;
        for(int i=1; i<=1000; i++){
            cnt = 0;
            for(int j=0; j<primeList.size(); j++){
                if(j > i) break;
                else if(i % primeList.get(j) == 0) cnt++;

                if(cnt == 3){
                    luckyNumbersList.add(i);
                    break;
                }
            }
        }

        //System.out.println(luckyNumbersList.size());
        //System.out.println(luckyNumbersList);

        int t = in.nextInt();
        for(int i=0; i<t; i++){
            System.out.println(luckyNumbersList.get(in.nextInt()-1));
        }
    }

    private static boolean isPrime(int n){
        if(n==1) return false;

        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}
