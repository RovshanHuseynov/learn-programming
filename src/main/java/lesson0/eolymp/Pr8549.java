package lesson0.eolymp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pr8549 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> primeList = new ArrayList<>();
        List<Integer> luckyNumbersList = new ArrayList<>();
        for(int i=1; i<=100; i++){
            if(isPrime(i)) primeList.add(i);
        }
        //System.out.println(primeList.size());
        //System.out.println(primeList);

        for(int i=0; i < primeList.size(); i++) {
            for (int j = 0; j < primeList.size(); j++) {
                for (int k = 0; k < primeList.size(); k++) {
                    if(i!=j && j!=k && i!=k) luckyNumbersList.add(primeList.get(i)*primeList.get(j)*primeList.get(k));
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
