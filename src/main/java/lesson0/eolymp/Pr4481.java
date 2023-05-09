package lesson0.eolymp;

import java.util.Scanner;

public class Pr4481 {
    static int[] a;
    static int [] t;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        a = new int[n+1];
        t = new int[4*n+4];
        for (int i = 1; i <= n; i++) {
            a[i] = in.nextInt();
        }
        build(1, 1, n);
        int m = in.nextInt();
        int x,y,z;
        for (int i = 1; i <= m; i++) {
            x = in.nextInt();
            y = in.nextInt();
            z = in.nextInt();

            if (x == 1) {
                // returns GCD
                System.out.println(query(1, 1, n, y, z));
            } else {
                // update
                update(1, 1, n, y, z);
            }
        }
    }

    private static void build(int node, int l, int r) {
        if(l>r || r<1) return;
        if(l == r){
            t[node] = a[l];
            return;
        }

        int mid = (l+r)/2;
        build(2*node, l, mid);
        build(2*node+1, mid+1, r);
        t[node] = gcd(t[2*node],t[2*node+1]);
    }

    private static int query(int node, int l, int r, int start, int end) {
        if(start > r || end < l) return 0;
        if(l >= start && r <= end) return t[node];

        int mid = (l+r)/2;
        return gcd(query(2*node,l,mid,start,end),query(2*node+1,mid+1,r,start,end));
    }

    private static void update(int node, int l, int r, int ind, int val) {
        if(l>r || r<1) return;

        if(l == r && l == ind) {
           a[l] = val;
           t[node] = val;
           return;
       }

       int mid = (l+r)/2;
       if(ind <= mid){
           update(2*node,l,mid,ind,val);
       } else {
           update(2*node+1,mid+1,r,ind,val);
       }
        t[node] = gcd(t[2*node],t[2*node+1]);
    }

    private static int gcd(int a, int b){
        while(b!=0){
            a = a%b;
            a = b + a - (b=a);
        }
        return a;
    }
}