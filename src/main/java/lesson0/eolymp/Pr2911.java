package lesson0.eolymp;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Pr2911 {
    static int MIN = Integer.MIN_VALUE;
    static int [] a;
    static Pair2911 [] t;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        a = new int[n+1];
        t = new Pair2911[2*n+2];
        for(int i=1; i<=n; i++){
            a[i] = in.nextInt();
        }
        build(1, 1, n);
        int m = in.nextInt();
        char c;
        int x,y;
        for(int i=1; i<=m; i++){
            c = in.next().charAt(0);
            x = in.nextInt();
            y = in.nextInt();

            if(c == 'Q'){
                // return sum
                Pair2911 ans = query(1, 1, n, x,y);
                System.out.println(ans.max1 + ans.max2);
            } else {
                // update
                update(1,1,n,x,y);
            }
        }
    }

    private static void build(int node, int l, int r){
        if(l>r || r<1) return;
        if(l==r) {
            t[node] = new Pair2911(a[l],MIN);
            return;
        }

        int mid = (l+r)/2;
        build(2*node, l, mid);
        build(2*node+1, mid+1, r);
        t[node] = createNewNode(t[2*node], t[2*node+1]);
    }

    private static Pair2911 query(int node, int l, int r, int start, int end){
        if(start > r || end < l) return new Pair2911(MIN, MIN);
        if(l >= start && r <= end) return t[node];

        int mid = (l+r)/2;
        return createNewNode(
                query(2*node, l, mid, start, end),
                query(2*node+1, mid+1, r, start, end));
    }

    private static void update(int node, int l, int r, int ind, int val){
        if(l > r || r < 1) return;
        if(l == r && l == ind){
            a[l] = val;
            t[node] = new Pair2911(val, MIN);
            return;
        }

        int mid = (l+r)/2;
        if(ind <= mid){
            update(2*node, l, mid, ind, val);
        }else {
            update(2*node+1, mid+1, r, ind, val);
        }
        t[node] = createNewNode(t[2*node], t[2*node+1]);
    }

    private static Pair2911 createNewNode(Pair2911 a, Pair2911 b){
        int a1 = a.max1;
        int b1 = a.max2;
        int c1 = b.max1;
        int d1 = b.max2;
        int maxA = IntStream.of(a1,b1,c1,d1).max().orElse(0);

        if(a1 == maxA){ a1 = MIN; }
        else if(b1 == maxA){ b1 = MIN; }
        else if(c1 == maxA){ c1 = MIN; }
        else { d1 = MIN; }

        int maxB = IntStream.of(a1,b1,c1,d1).max().orElse(0);
        return new Pair2911(maxA, maxB);
    }
}

class Pair2911 {
    int max1,max2;

    public Pair2911(int max1, int max2){
        this.max1 = max1;
        this.max2 = max2;
    }
}