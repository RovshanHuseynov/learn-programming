package lesson0.eolymp;

import java.util.Scanner;

public class Pr4473 {
    static int[] a;
    static int[] tree;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        a = new int[n+1];
        tree = new int[4*n+4];
        for(int i=1; i<=n; i++){
            a[i] = in.nextInt();
        }

        build(1, 1, n);
        /*for(int i=1; i<2*n; i++) {
            System.out.println(i + " " + tree[i]);
        }*/
        int x,y;
        int m = in.nextInt();
        for(int i=0; i<m; i++){
            x = in.nextInt();
            y = in.nextInt();

            if(x > y){
                x = x + y;
                y = x - y;
                x = x - y;
            }
            System.out.println(query(1, 1, n, x, y));
        }
    }

    private static void build(int node, int l, int r){
        //System.out.println("node: " + node + " left: " + l + " right: " + r);
        if(l > r || r < 1) return;

        if(l == r){
            tree[node] = a[l];
            return;
        }

        int mid = (l+r)/2;
        build(2*node, l, mid);
        build(2*node+1, mid+1,r);
        tree[node] = Math.max(tree[2*node] , tree[2*node+1]);
    }

    private static int query(int node, int l, int r, int start, int end){
        if(l > end || r < start) return Integer.MIN_VALUE;
        if(l >= start && r <= end) return tree[node];

        int mid = (l+r)/2;
        return Math.max(query(2*node, l, mid, start, end), query(2*node+1, mid+1, r,start,end));
    }
}
