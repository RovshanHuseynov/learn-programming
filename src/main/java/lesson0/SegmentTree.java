package lesson0;

import java.util.Scanner;

public class SegmentTree {
    /*
    6
    1 3 5 7 9 11
     */
    // https://www.hackerearth.com/practice/data-structures/advanced-data-structures/segment-trees/tutorial/

    static int [] a;
    static int [] tree;
    static int n;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        a = new int[n];
        tree = new int[2*n+2];

        for(int i=0; i<n; i++){
            a[i] = in.nextInt();
        }

        build(1, 0, n-1);
        for(int i=1; i<2*n; i++){
            System.out.println(i + " " + tree[i]);
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
        tree[node] = tree[2*node] + tree[2*node+1];
    }
}
