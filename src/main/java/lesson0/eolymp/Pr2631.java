package lesson0.eolymp;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Pr2631 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int max,size;
        String val;
        List<Integer> l;
        in.nextLine();

        for(int i=1; i<=n; i++){
            while(in.hasNextLine()){
                max = 0;
                val = in.nextLine();
                l = Stream.of(val.split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());
                size = l.size();
                // TODO write it with map and flatMap
                for(int j=0; j<size-1; j++){
                    for(int k=j+1; k<size; k++){
                        max = Math.max(max, ebob(l.get(j), l.get(k)));
                    }
                }
                //System.out.println(size);
                System.out.println(max);
                //System.out.println();
            }
        }
    }

    private static int ebob(int a, int b){
        while(b > 0){
            a = a%b;
            a = b + a - (b=a);
        }
        return a;
    }
}
