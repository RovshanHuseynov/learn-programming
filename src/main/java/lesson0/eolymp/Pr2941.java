package lesson0.eolymp;

import java.util.Scanner;

public class Pr2941 {
    static int [] a;
    static long [] t;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        a = new int[n+1];
        t = new long[5*n+5];
        for(int i=1; i<=n; i++){
            a[i] = in.nextInt();
        }
        build(1,1,n);
        int q = in.nextInt();
        char c;
        int f,t;
        for(int i=1; i<=q; i++){
            c = in.next().charAt(0);
            f = in.nextInt();
            t = in.nextInt();

            if(c == '?'){
                if(f > t) f = t + f - (t=f);
                System.out.println(query(1,1,n,f,t));
            } else {
                update(1,1,n,f,t);
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
        build(2*node, l, mid);
        build(2*node+1, mid+1, r);
        t[node] = t[2*node]+t[2*node+1];
    }

    private static long query(int node, int l, int r, int start, int end){
        if(l > end || r < start) return 0L;
        if(l >= start && r <= end) return t[node];

        int mid = (l+r)/2;
        return query(2*node,l,mid,start,end) + query(2*node+1,mid+1,r,start,end);
    }

    private static void update(int node, int l, int r, int ind, int val){
        if(l > r || r < 0) return;
        if(l == r && l == ind) {
            a[l] += val;
            t[node] += val;
            return;
        }

        int mid = (l+r)/2;
        if(ind <= mid){
            update(2*node,l,mid,ind,val);
        } else{
            update(2*node+1,mid+1,r,ind,val);
        }
        t[node] = t[2*node]+t[2*node+1];
    }
}
