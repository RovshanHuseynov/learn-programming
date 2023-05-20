package lesson0.eolymp;

import java.util.Scanner;

public class Pr3252 {
    private static final long MOD = 1000000007L;
    private static long [] a;
    private static long [] t;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        a = new long[n];
        t = new long[4*n];
        long p = 91;
        long q = 47;
        build(1, 0, n-1);
        //Arrays.stream(t).forEach(i -> System.out.print(i + " "));
        //System.out.println();
        int m = in.nextInt();
        char c;
        long aa,bb,z,ind,val,l,r;
        for(int i=1; i<=m; i++){
            c = in.next().charAt(0);
            aa = in.nextInt();
            bb = in.nextInt();

            if(c == '!'){
                // update
                //System.out.println("update");
                ind = (aa+p)% n;
                val = (bb+q)% MOD;
                //System.out.println(left);
                //System.out.println(right);
                update(1, 0, n-1, ind, val);
                //System.out.println(Arrays.toString(a));
                //System.out.println(Arrays.toString(t));
                //System.out.println();
            } else if(c == '?') {
                // return sum
                //System.out.println("return sum");
                l = (aa+p)%n;
                r = (bb+q)%n;
                if(l > r) l = r + l - (r = l);
                z = query(1,0,n-1,l,r);
                System.out.println(z);
                p = ((p * 31L) + z) % MOD;
                q = ((q * 29L) + z) % MOD;
            }
        }
    }

    private static void build(int node, int l, int r){
        if(l > r || r < 0) return;

        if(l == r){
            t[node] = a[l];
            return;
        }

        int mid = (l+r)/2;
        build(2*node,l,mid);
        build(2*node+1,mid+1,r);
        t[node] = t[2*node] + t[2*node+1];
    }
    private static long query(int node, int l, int r, long start, long end){
        if(start > r || end < l || l > r || r < 0) return 0;
        if(start <= l && end >= r) return t[node];

        int mid = (l+r)/2;
        return query(2*node, l, mid, start, end) + query(2*node+1, mid+1,r, start, end);
    }
    private static void update(int node, int l, int r, long ind, long val){
        if(l == r && l == ind) {
            t[node] = val;
            a[l] = val;
            return;
        }

        int mid = (l+r)/2;

        if(ind <= mid)
            update(2*node, l, mid, ind, val);
        else
            update(2*node+1, mid+1, r, ind, val);
        t[node] = t[2*node] + t[2*node+1];
    }
}
