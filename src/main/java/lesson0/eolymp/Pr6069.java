package lesson0.eolymp;

import java.util.Arrays;
import java.util.Scanner;

public class Pr6069 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] a = new int[4];
        int [] b = new int[8];
        Tuple6069 [] res = new Tuple6069[21];

        for(int i=1; i<=3; i++){
            a[i] = in.nextInt();
        }

        for(int i=1; i<=7; i++){
            b[i] = in.nextInt();
        }

        int cnt=0;
        for(int i=1; i<=3; i++){
            for(int j=1; j<=7; j++){
                res[cnt++] = new Tuple6069((double)a[i]/(double)b[j],i,j);
            }
        }

        Arrays.stream(res)
                .sorted(((o1, o2) -> {
                   if(o1.avg != o2.avg) return Double.compare(o1.avg, o2.avg);
                   else return o1.from- o2.from;
                }))
                .forEach(Tuple6069::print);
    }
}

class Tuple6069 {
    double avg;
    int from,to;
    public Tuple6069(double avg, int from, int to){
        this.avg = avg;
        this.from = from;
        this.to = to;
    }
    public void print(){
        System.out.printf("%.2f %d %d\n",avg,from,to);
    }
}