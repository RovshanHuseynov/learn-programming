package lesson0.eolymp;

import java.util.Arrays;
import java.util.Scanner;

// source video: https://www.youtube.com/watch?v=xuoQdt5pHj0
public class SegmentTreeLazyPropagation {
    static int n;
    static int [] a;
    static int [] t;
    static int [] lazy;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        a = new int[n+1];
        t = new int[4*n+4];
        lazy = new int[4*n+4];
        for(int i=1; i<=n; i++){
            a[i] = in.nextInt();
        }
        build(1,1,n);
        System.out.println(Arrays.toString(t));
        System.out.println(Arrays.toString(lazy));
        int m = in.nextInt();
        int type,l,r,val;
        for(int i=1; i<=m; i++){
            type = in.nextInt();
            l = in.nextInt();
            r = in.nextInt();

            if(type == 1){
                System.out.println(query(1,1,n,l,r));
            } else {
                val = in.nextInt();
                update(1,1,n,l,r,val);
                System.out.println(Arrays.toString(t));
                System.out.println(Arrays.toString(lazy));
            }
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
        t[node] = Math.min(t[2*node], t[2*node+1]);
    }

    private static void update(int node, int l, int r, int start, int end, int val){
        propagation(node, l, r);

        // no overlap
        if(l > end || r < start) return;

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

    private static int query(int node, int l, int r, int start, int end){
        propagation(node, l, r);

        if(l > end || r < start) return Integer.MAX_VALUE;
        if(l >= start && r <= end) return t[node];

        int mid = (l+r)/2;
        return Math.min(query(2*node,l,mid,start,end), query(2*node+1,mid+1,r,start,end));
    }

    private static void propagation(int node, int l, int r) {
        if (lazy[node] != 0) {
            t[node] += lazy[node];
            if (l != r) {
                lazy[2*node] = lazy[node];
                lazy[2*node+1] = lazy[node];
            }
            lazy[node] = 0;
        }
    }
}

/*
8
5 6 8 5 7 1 3 2
5
2 0 3 3
2 0 3 1
2 0 0 2
 */
