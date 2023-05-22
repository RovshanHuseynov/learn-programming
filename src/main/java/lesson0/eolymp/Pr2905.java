package lesson0.eolymp;

import java.util.Scanner;

public class Pr2905 {
    static int [] a;
    static long [] t;
    static long [] lazy;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        a = new int[n+1];
        t = new long[4*n+4];
        lazy = new long[4*n+4];

        build(1,1,n);

        int k = in.nextInt();
        int operation,l,r;
        for(int i=1; i<=k; i++){
            operation = in.nextInt();
            l = in.nextInt();
            r = in.nextInt();

            if(operation == 0) update(1,1,n,l,r);
            else System.out.println(query(1,1,n,l,r));
        }
    }

    private static void build(int node, int l, int r){
        if(l > r || r < 1) return;
        if(l == r){
            t[node] = a[l];
            return;
        }

        int mid = (l+r)/2;
        build(2*node,l,mid);
        build(2*node+1,mid+1,r);
        t[node] = t[2*node] + t[2*node+1];
    }

    private static void propagation(int node, int l, int r){
        if(lazy[node] != 0){
            t[node] = lazy[node];
            if (l != r) {
                lazy[2*node] = lazy[node];
                lazy[2*node+1] = lazy[node];
            }
            lazy[node] = 0;
        }
    }

    private static long query(int node, int l, int r, int start, int end){
        propagation(node, l, r);

        if(l > end || r < start) return Integer.MAX_VALUE;
        if(l >= start && r <= end) return t[node];

        int mid = (l+r)/2;
        return query(2*node,l,mid,start,end)+query(2*node+1,mid+1,r,start,end);
    }

    private static long update(int node, int l, int r, int start, int end){
        propagation(node, l, r);

        // no overlap
        if(l > end || r < start) return 0;

        // total overlap
        if(l >= start && r <= end){
            t[node] += val;
            if(l!=r)
            {
                lazy[2*node] += val;
                lazy[2*node+1] += val;
            }
            return;
        }

        // partial overlap
        int mid = (l+r)/2;
        update(2*node,l,mid,start,end,val);
        update(2*node+1,mid+1,r,start,end,val);
        t[node] = Math.min(t[2*node], t[2*node+1]);
    }
}
