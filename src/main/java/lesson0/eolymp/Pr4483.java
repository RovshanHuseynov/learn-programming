package lesson0.eolymp;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Pr4483 {
    static int [] a;
    static Pair4483 [] t;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        a = new int[n+1];
        t = new Pair4483[4*n+4];
        for (int i=1; i<=n; i++) {
            a[i] = in.nextInt();
        }
        build(1,1,n);
        //System.out.println(Arrays.toString(a));
        //System.out.println(Arrays.toString(t));
        int m = in.nextInt();
        int type;
        for(int i=1; i<=m; i++){
            type = in.nextInt();

            if(type == 1){
                int l = in.nextInt();
                int r = in.nextInt();
                Pair4483 ans = query(1,1,n,l,r);
                //System.out.println(ans);
                if(ans.min1 + ans.min2 <= k) System.out.println("Yes");
                else System.out.println("No");
            } else {
                int ind = in.nextInt();
                int val = in.nextInt();
                update(1,1,n,ind,val);
            }
        }
    }

    private static void build(int node, int l, int r){
        if(l > r || r < 1) return;
        if(l == r){
            t[node] = new Pair4483(a[l]);
            return;
        }

        int mid = (l+r)/2;
        build(2*node,l,mid);
        build(2*node+1,mid+1,r);
        t[node] = generate(t[2*node], t[2*node+1]);
    }

    private static Pair4483 generate(Pair4483 l, Pair4483 r){
        int min1 = Stream.of(l.min1, l.min2, r.min1, r.min2).sorted().findFirst().orElse(Integer.MAX_VALUE);
        int min2 = Stream.of(l.min1, l.min2, r.min1, r.min2).sorted().skip(1).findFirst().orElse(Integer.MAX_VALUE);
        return new Pair4483(min1,min2);
    }

    private static void update(int node, int l, int r, int ind, int val){
        if(l < r || r < 1) return;
        if(l == r && l == ind){
            t[node] = new Pair4483(val);
            a[l] = val;
            return;
        }

        int mid = (l+r)/2;
        if(ind <= mid) update(2*node,l,mid,ind,val);
        else update(2*node+1,mid+1,r,ind,val);
        t[node] = generate(t[2*node], t[2*node+1]);
    }

    private static Pair4483 query(int node, int l, int r, int start, int end){
        if(l > end || r < start) return new Pair4483();
        if(l >= start && r <= end) return t[node];

        int mid = (l+r)/2;
        return generate(query(2*node,l,mid,start,end), query(2*node+1,mid+1,r,start,end));
    }
}

class Pair4483 {
    int min1,min2;
    Pair4483(){
        this(Integer.MAX_VALUE, Integer.MAX_VALUE);
    }

    Pair4483(int min1){
        this(min1, Integer.MAX_VALUE);
    }

    Pair4483(int min1, int min2){
        this.min1 = min1;
        this.min2 = min2;
    }

    public String toString(){
        return "(" + min1 + " " + min2 + ")";
    }
}