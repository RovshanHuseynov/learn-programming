package lesson0.eolymp;

import java.util.Scanner;

public class Pr4482 {
    static int[] a;
    static Pair4482 [] t;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        a = new int[n+1];
        t = new Pair4482[4*n+4];
        for (int i = 1; i <= n; i++) {
            a[i] = in.nextInt();
        }
        build(1, 1, n);
        //System.out.println(Arrays.toString(t));
        int m = in.nextInt();
        int x,y,z;
        for (int i = 1; i <= m; i++) {
            x = in.nextInt();
            y = in.nextInt();
            z = in.nextInt();

            if (x == 1) {
                System.out.println(query(1, 1, n, y, z));
            } else {
                // update
                update(1, 1, n, y, z);
                //System.out.println(Arrays.toString(a));
                //System.out.println(Arrays.toString(t));
            }
        }
    }

    private static void build(int node, int l, int r) {
        if(l>r || r<1) return;
        if(l == r){
            t[node] = new Pair4482(a[l]);
            return;
        }

        int mid = (l+r)/2;
        build(2*node,l,mid);
        build(2*node+1,mid+1,r);
        t[node] = new Pair4482(t[2*node], t[2*node+1]);
    }

    private static Pair4482 query(int node, int l, int r, int start, int end) {
        if(r < start || l > end) return new Pair4482();
        if(l >= start && r <= end) return t[node];

        int mid = (l+r)/2;
        return new Pair4482(query(2*node,l,mid,start,end), query(2*node+1,mid+1,r,start,end));
    }

    private static void update(int node, int l, int r, int ind, int val) {
        if(l > r|| r < 1) return;

        if(l == r && l == ind){
            a[l] = val;
            t[node] = new Pair4482(val);
            return;
        }

        int mid = (l+r)/2;
        if(ind <= mid){
            update(2*node, l, mid, ind, val);
        }
        else {
            update(2*node+1, mid+1, r, ind, val);
        }
        t[node] = new Pair4482(t[2*node], t[2*node+1]);
    }
}

class Pair4482 {
    long gcd, lcm;
    public Pair4482(Pair4482 a, Pair4482 b){
        this.gcd = gcd(a.gcd,b.gcd);
        this.lcm = lcm(a.lcm,b.lcm);
    }

    public Pair4482(long a){
        this.gcd = a;
        this.lcm = a;
    }

    public Pair4482(){
        this(0);
    }

    private static long gcd(long a, long b){
        while(b!=0){
            a = a%b;
            a = b + a - (b=a);
        }
        return a;
    }

    private static long lcm(long a, long b){
        if(a == 0 || b == 0) return Math.max(a,b);
        return a*b/gcd(a,b);
    }

    public String toString(){
        //System.out.println(gcd);
        //System.out.println(lcm);

        if(gcd < lcm) return "wins";
        else if(gcd == lcm)  return "draw";
        else return "loser";
    }

    /*@Override
    public String toString() {
        return "{"+ gcd + "-" + lcm + '}';
    }*/
}