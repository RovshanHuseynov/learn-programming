package lesson0.eolymp;

import java.util.Scanner;

public class Pr2906 {
    static int n;
    static int [] a;
    static Pair2906 [] t;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        a = new int[n+1];
        t = new Pair2906[4*n+4];
        int m = in.nextInt();
        int x,y;
        for(int i=1; i<=m; i++){
            x = in.nextInt();
            y = in.nextInt();
        }
    }

    private static void build(int node, int l, int r){
        if(l > r || r < 1) return;
        if(l == r){
            t[node] = new Pair2906(1,1,1);
        }

        int mid = (l+r)/2;
        build(2*node,l,mid);
        build(2*node+1,mid+1,r);
        int max = Math.max(t[2*node].max, t[2*node+1].max);
        if(a[mid] <= a[mid+1]){
            max = Math.max(max, t[2*node].maxPost + t[2*node+1].maxPre);
        }
        int maxPre = t[2*node].maxPre;
        if(a[mid] <= a[mid+1] && maxPre == l-mid+1){
            maxPre = t[2*node].maxPre + t[2*node+1].maxPre;
        }
        int maxPost = t[2*node+1].maxPost;
        if(a[mid] <= a[mid+1] && maxPost == r-mid){
            maxPost = t[2*node].maxPost + t[2*node+1].maxPre;
        }
        t[node] = new Pair2906(maxPre, max, maxPost);
    }
}

class Pair2906 {
    int maxPre, max, maxPost;
    public Pair2906(int maxPre, int max, int maxPost){
        this.maxPre = maxPre;
        this.max = max;
        this.maxPost = maxPost;
    }
}