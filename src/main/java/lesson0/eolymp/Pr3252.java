package lesson0.eolymp;

import java.util.Scanner;

public class Pr3252 {
    private static int MOD = 1000000007;
    private static int n, p, q;
    private static int [] a;
    private static int [] t;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        a = new int[n];
        t = new int[3*n];
        p = 91;
        q = 47;
        build(1, 0, n-1);
        //Arrays.stream(t).forEach(i -> System.out.print(i + " "));
        //System.out.println();
        int m = in.nextInt();
        char c;
        int aa,bb,z;
        for(int i=1; i<=m; i++){
            c = in.next().charAt(0);
            aa = in.nextInt();
            bb = in.nextInt();

            if(c == '!'){
                // update
                //System.out.println((aa+p)%n);
                //System.out.println((bb+q)%MOD);
                update(1, 0, n-1, (aa+p)%n, (bb+q)%MOD);
                //System.out.println(Arrays.toString(a));
                //System.out.println(Arrays.toString(t));
                //System.out.println();
            } else if(c == '?'){
                // return sum
                z = query(1,0,n-1,(aa+p)%n,(bb+q)%n);
                System.out.println(z);
                p = (p * 31) + z%MOD;
                q = (q * 29) + z%MOD;
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
    private static int query(int node, int l, int r, int start, int end){
        if(start > r || end < l) return 0;
        if(start <= l && end >= r) return t[node];

        int mid = (l+r)/2;
        return query(2*node, l, mid, start, end) + query(2*node+1, mid+1,r, start, end);
    }
    private static void update(int node, int l, int r, int ind, int val){
        if(l == r && l == ind) {
            t[node] = val;
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
