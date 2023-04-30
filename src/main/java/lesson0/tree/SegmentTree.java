package lesson0.tree;

import java.util.Scanner;

public class SegmentTree {
    /*
    5
    1 3 5 7 9
     */
    // https://www.hackerearth.com/practice/data-structures/advanced-data-structures/segment-trees/tutorial/

    static int [] a;
    static int [] x;
    static int [] y;
    static int [] tree;
    static int n;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int m = in.nextInt();
        a = new int[n];
        x = new int[n];
        y = new int[n];
        tree = new int[2*n+2];

        for(int i=0; i<n; i++){
            a[i] = in.nextInt();
        }

        build(1, 0, n-1);
        System.out.println("print Segment Tree");
        for(int i=1; i<2*n; i++){
            System.out.println("index: " + i + " - value: " + tree[i]);
        }

        for(int i=0; i<m; i++){
            x[i] = in.nextInt();
            y[i] = in.nextInt();
            System.out.println(query( 1, 0, n-1, x[i]-1, y[i]-1));
        }
    }

    private static void build(int node, int l, int r){
        if(l > r || l < 0) return;

        if(l == r){
            tree[node] = a[l];
            return;
        }

        int mid = (l+r)/2;
        build(2*node, l, mid);
        build(2*node+1, mid+1,r);
        tree[node] = Math.min(tree[2*node] , tree[2*node+1]);
    }

    private static int query(int node, int l, int r, int start, int end){
        //System.out.println(node + " " + l + " " + r + " " + start + " " + end);
        if(start > r || end < l) return Integer.MAX_VALUE;
        if(start <= l && end >= r) return tree[node];

        int mid = (l+r)/2;
        return Math.min(query(2*node, l, mid, start, end), query( 2*node+1, mid+1, r, start, end));
    }
}
