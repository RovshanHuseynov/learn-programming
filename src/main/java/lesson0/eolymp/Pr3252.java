package lesson0.eolymp;

import java.util.Arrays;
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
        t = new int[2*n];
        for(int i=0; i<n; i++){
            a[i] = in.nextInt();
        }
        /*
        8
        9 2 5 4 8 6 1 8
         */
        p = 91;
        q = 47;
        build(1, 0, n-1);
        Arrays.stream(t).forEach(i -> System.out.print(i + " "));
        System.out.println();
        int m = in.nextInt();
        char c;
        int p,q;
        for(int i=1; i<=m; i++){
            //c = in.next().charAt(0);
            p = in.nextInt();
            q = in.nextInt();

            c = '?';
            if(c == '!'){
                // update
            } else if(c == '?'){
                // return sum
                System.out.println(query(1,0,n-1,p,q));
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
    private static void update(int node, int l, int r, int val){}
}
