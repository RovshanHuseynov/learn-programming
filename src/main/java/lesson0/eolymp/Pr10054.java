package lesson0.eolymp;

import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Pr10054 {
    private static String convertToBinary(long n){
        StringBuilder sb = new StringBuilder();
        while(n > 0){
            sb.append(n%2);
            n/=2;
        }
        return sb.reverse().toString();
    }

    private static long convertToDecimal(String s){
        long sum = 0;
        long hasil = 1;

        for(int i=s.length()-1; i>=0; i--){
            sum += ((int)s.charAt(i)-48)*hasil;
            hasil*=2;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        String original = convertToBinary(n);
        String sortedAsc = original.chars().boxed().map(c -> Character.toString(c)).sorted().collect(Collectors.joining());
        String sortedDesc = original.chars().boxed().map(c -> Character.toString(c)).sorted(Comparator.reverseOrder()).collect(Collectors.joining());
        //System.out.println(sortedAsc);
        //System.out.println(sortedDesc);
        System.out.println(convertToDecimal(sortedDesc) - convertToDecimal(sortedAsc));
    }
}
