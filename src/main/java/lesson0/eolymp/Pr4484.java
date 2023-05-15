package lesson0.eolymp;

import java.util.Scanner;

public class Pr4484 {
    static String s;
    static Pair4484 [] t;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        s = in.nextLine();
        t = new Pair4484[5*s.length()+5];
        build(1,1,s.length());
        int m = in.nextInt();
        int x,l,r;
        char c;
        for(int i=1; i<=m; i++){
            x = in.nextInt();
            l = in.nextInt();

            if(x == 1){
                r = in.nextInt();
                System.out.println(query(1,1,s.length(),l,r));
            } else{
                c = in.nextLine().charAt(0);
                update(1,1,s.length(),l,c);
            }
        }
    }

    private static void build(int node, int l, int r){
        if(l > r || r < 1) return;
        if(l == r){
            if(s.charAt(l-1) == 'l') t[node] = new Pair4484(1,0);
            else if(s.charAt(l-1) == 'd') t[node] = new Pair4484(0,1);
            return;
        }

        int mid = (l+r)/2;
        build(2*node, l, mid);
        build(2*node+1, mid+1, r);
        t[node] = new Pair4484(t[2*node].cntL + t[2*node+1].cntL , t[2*node].cntD + t[2*node+1].cntD);
    }

    private static Pair4484 query(int node, int l, int r, int start, int end){
        if(l > end || r < start) return new Pair4484(0,0);
        if(l >= start && r <= end) return t[node];

        int mid = (l+r)/2;
        Pair4484 ll = query(2*node, l, mid, start, end);
        Pair4484 rr = query(2*node+1, mid+1, r, start, end);
        return new Pair4484(ll.cntL + rr.cntL , ll.cntD + rr.cntD);
    }

    private static void update(int node, int l, int r, int ind, char c){
        if(l > r || r < 1) return;
        if(l == r && l == ind){
            s = s.substring(0,ind) + c + s.substring(ind+1);
            return;
        }

        int mid = (l+r)/2;
        if(ind <= mid){
            update(2*node,l,mid,ind,c);
        } else {
            update(2*node+1,mid+1,r,ind,c);
        }
        t[node] = new Pair4484(t[2*node].cntL + t[2*node+1].cntL , t[2*node].cntD + t[2*node+1].cntD);
    }
}

class Pair4484 {
    long cntL,cntD;
    public Pair4484(long cntL, long cntD){
        this.cntL = cntL;
        this.cntD = cntD;
    }

    public String toString(){
        return String.valueOf(Math.max(cntL, cntD));
    }
}
