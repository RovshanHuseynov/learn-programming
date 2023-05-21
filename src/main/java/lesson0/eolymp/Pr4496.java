package lesson0.eolymp;

import java.util.Scanner;

public class Pr4496 {
    static int [] a;
    static long [] t;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        a = new int[n+1];
        t = new long[4*n+4];
        for(int i=1; i<=n; i++){
            a[i] = in.nextInt();
        }
        build(1,1,n);
        int m = in.nextInt();
        int type;
        for(int i=1; i<=m; i++){
            type = in.nextInt();
            if(type == 1){
                long weight = in.nextLong();
                System.out.println(query(1,1,n,weight));
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
        if(l == r && l == ind){
            a[l] = val;
            t[node] = val;
            return;
        }

        int mid = (l+r)/2;
        if(ind <= mid) update(2*node,l,mid,ind,val);
        else update(2*node+1,mid+1,r,ind,val);
        t[node] = t[2*node] + t[2*node+1];
    }

    private static int query(int node, int l, int r, long weight){
        if(l == r){
            if(t[node] <= weight) return 1;
            else return 0;
        }

        int mid = (l+r)/2;
        if(t[2*node] > weight) return query(2*node,l,mid,weight);
        else return mid - l + 1 + query(2*node+1,mid+1,r,weight - t[2*node]);
    }
}