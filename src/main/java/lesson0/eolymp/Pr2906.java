package lesson0.eolymp;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Pr2906 {
    static int n;
    static int [] a;
    static Pair2906 [] t;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        a = new int[n+1];
        t = new Pair2906[4*n+4];
        for(int i=1; i<=n; i++){
            a[i] = in.nextInt();
        }

        build(1,1,n);

        int m = in.nextInt();
        int x,y;
        for(int i=1; i<=m; i++){
            x = in.nextInt();
            y = in.nextInt();
            System.out.println(query(1,1,n,x,y).max);
        }
    }

    private static void build(int node, int l, int r){
        if(l > r || r < 1) return;

        if(l == r){
            t[node] = new Pair2906(1,1,1);
            return;
        }

        int mid = (l+r)/2;
        build(2*node,l,mid);
        build(2*node+1,mid+1,r);
        t[node]= generate(t[2*node], t[2*node+1], l, r);
    }

    private static Pair2906 query(int node, int l, int r, int start, int end){
        if(l > end || r < start) return new Pair2906(0,0,0);
        if(l >= start && r <= end) return t[node];

        int mid = (l+r)/2;
        Pair2906 ansLeft = query(2*node,l,mid,start,end);
        Pair2906 ansRight = query(2*node+1,mid+1,r,start,end);

        if(Pair2906.isNull(ansLeft)) return ansRight;
        else if(Pair2906.isNull(ansRight)) return ansLeft;

        return generate(ansLeft, ansRight, l, r);
    }

    private static Pair2906 generate(Pair2906 left, Pair2906 right, int l, int r){
        int max = Math.max(left.max, right.max);
        int mid = (l+r)/2;
        if(a[mid] <= a[mid+1]){
            max = Math.max(max, left.maxPost + right.maxPre);
        }
        int maxPre = left.maxPre;
        if(a[mid] <= a[mid+1] && left.maxPre == mid-l+1){
            maxPre = left.maxPost + right.maxPre;
        }
        int maxPost = right.maxPost;
        if(a[mid] <= a[mid+1] && right.maxPost == r-mid){
            maxPost = left.maxPost + right.maxPre;
        }
        return new Pair2906(maxPre, max, maxPost);
    }
}

class Pair2906 {
    int maxPre, max, maxPost;
    public Pair2906(int maxPre, int max, int maxPost){
        this.maxPre = maxPre;
        this.max = max;
        this.maxPost = maxPost;
    }

    public String toString(){
        return Stream.of(maxPre, max, maxPost)
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
    }

    public static boolean isNull(Pair2906 node){
        return node.max == 0
                && node.maxPre == 0
                && node.maxPost == 0;
    }
}