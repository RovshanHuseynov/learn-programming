package lesson0.eolymp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Pr5084_2 {
    private static int n;
    private static int[] a;
    private static List<Integer>[] t;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        a = new int[n+1];
        t = new ArrayList[4*n+4];
        for(int i=1; i<=n; i++){
            a[i] = in.nextInt();
        }
        build(1,1,n);
        for(int i=1; i<=4*n; i++){
            //System.out.println(i + "->" + t[i]);
        }
        int q = in.nextInt();
        int l,r,x;
        for(int i=1; i<=q; i++){
            l = in.nextInt();
            r = in.nextInt();
            x = in.nextInt();
        }
    }

    private static void build(int node, int l, int r){
        if(l>r || r<1) return;
        if(l == r){
            //System.out.println("stop " + node + " " + l + " " + a.get(l));
            //System.out.println("stop " + node + " " + a.get(l));
            //System.out.println(t.get(node));
            t[node] = new ArrayList<>();
            t[node].add(a[l]);
            //System.out.println(t.get(node));
            return;
        }

        int mid = (l+r)/2;
        build(2*node,l,mid);
        build(2*node+1,mid+1,r);
        List<Integer> combined = generate(node);
        if(t[node] == null) t[node] = new ArrayList<>();
        t[node].addAll(combined);
    }

    private static List<Integer> generate(int node){
        //System.out.println("generate " + node);
        List<Integer> l = t[2*node];
        List<Integer> r = t[2*node+1];
        List<Integer> ans = Stream.concat(l.stream(), r.stream())
                .sorted()
                .collect(Collectors.toList());
        //System.out.println("node " + node);
        //System.out.println(l);
        //System.out.println(r);
        //System.out.println(node + " ans->" + ans);
        return ans;
    }

    private static int binarySearch(int l, int r, int val, int[] a){
        //System.out.println(l + " " + r + " " + val);
        if(r<1 || l>r || l>a.length || a[l]>=val) {
            //System.out.println(l + " " + r + " stop");
            return 0;
        }
        if(a[r]<val) {
            //System.out.println(l + " " + r + " result " + (r-l+1));
            return r-l+1;
        }

        int mid = (l+r)/2;
        return binarySearch(l,mid,val,a) + binarySearch(mid+1,r,val,a);
    }
}
