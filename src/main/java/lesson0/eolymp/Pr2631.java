package lesson0.eolymp;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
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
                for(int j=0; j<size-1; j++){
                    for(int k=j+1; k<size; k++){
                        max = Math.max(max, ebob(l.get(j), l.get(k)));
                    }
                }

                //List<Integer> finalL = l;
                //l.forEach(j -> finalL.forEach(k -> System.out.println(j + "-" + k)));

                AtomicInteger maxx = new AtomicInteger();
                int finalSize = size;
                List<Integer> finalL1 = l;
                IntStream.range(0, size).forEach(j -> IntStream.range(j+1, finalSize).forEach(k -> maxx.set(Math.max(maxx.get(), ebob(finalL1.get(j), finalL1.get(k))))));

                //System.out.println(size);
                //System.out.println(max);
                //System.out.println();
                System.out.println(maxx);
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
