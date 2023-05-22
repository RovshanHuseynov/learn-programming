package lesson0.eolymp;

import java.util.Scanner;

public class Pr4255 {
    static int [] a;
    static long [] t;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        a = new int[n+1];
        t = new long[4*n+4];

        build(1,1,n);

        int k = in.nextInt();
        char c;
        int l,r;
        for(int i=1; i<=k; i++){
            c = in.next().charAt(0);
            l = in.nextInt();
            r = in.nextInt();

            if(c == 'A') update(1,1,n,l,r);
            else System.out.println(sum(1,1,n,l,r));
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

    private static void update(int node, int l, int r, int ind, int val){
        if(l > r || r < 1) return;
        if(l == r && l == ind) {
            a[l] = val;
            t[node] = val;
            return;
        }

        int mid = (l+r)/2;
        if(ind <= mid)
            update(2*node,l,mid,ind,val);
        else
            update(2*node+1,mid+1,r,ind,val);
        t[node] = t[2*node] + t[2*node+1];
    }

    private static long sum(int node, int l, int r, int start, int end){
        if(l > end || r < start) return 0;
        if(l >= start && r <= end) return t[node];

        int mid = (l+r)/2;
        return sum(2*node,l,mid,start,end)+sum(2*node+1,mid+1,r,start,end);
    }
}
