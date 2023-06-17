package lesson0.eolymp;

import java.util.*;

public class Pr1291 {
    static Set<Long> list;
    static List<Long> input;
    static long max;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        long n;
        max = 0;
        list = new TreeSet<>();
        input = new ArrayList<>();
        for(int i=1; i<=t; i++){
            n = in.nextLong();
            input.add(n);
            if(n >= max) max = n;
        }
        rec(47);
        int cnt;
        //list.forEach(val -> System.out.print(val + " "));
        for(long i : input){
            cnt = 0;
            for(long j : list){
                if(j <= i) cnt++;
                else break;
            }
            System.out.println(cnt);
        }
    }

    private static void rec(long val){
        if(val > max) return;
        if(String.valueOf(val).contains("47")) {
            list.add(val);
            rec(Long.parseLong(val+"0"));
            rec(Long.parseLong(val+"1"));
            rec(Long.parseLong(val+"2"));
            rec(Long.parseLong(val+"3"));
            rec(Long.parseLong(val+"4"));
            rec(Long.parseLong(val+"5"));
            rec(Long.parseLong(val+"6"));
            rec(Long.parseLong(val+"7"));
            rec(Long.parseLong(val+"8"));
            rec(Long.parseLong(val+"9"));
            rec(Long.parseLong("1"+val));
            rec(Long.parseLong("2"+val));
            rec(Long.parseLong("3"+val));
            rec(Long.parseLong("4"+val));
            rec(Long.parseLong("5"+val));
            rec(Long.parseLong("6"+val));
            rec(Long.parseLong("7"+val));
            rec(Long.parseLong("8"+val));
            rec(Long.parseLong("9"+val));
        }
    }
}

class Class1291 {
    boolean flag4;
    boolean flag7;

    public Class1291(boolean flag4, boolean flag7){
        this.flag4 = flag4;
        this.flag7 = flag7;
    }
}
