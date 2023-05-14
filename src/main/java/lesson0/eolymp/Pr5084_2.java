package lesson0.eolymp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Pr5084_2 {
    private static int n;
    private static int[] a;
    private static List[] t;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        a = new int[n+1];
        t = new ArrayList[4*n+4];
        for(int i=1; i<=n; i++){
            a[i] = in.nextInt();
        }
        build(1,1,n);
        int q = in.nextInt();
        int l,r,x;
        for(int i=1; i<=q; i++){
            l = in.nextInt();
            r = in.nextInt();
            x = in.nextInt();
            System.out.println(query(1,1,n,x,l,r));
        }
    }

    private static void build(int node, int l, int r){
        if(l>r || r<1) return;
        if(l == r){
            t[node] = new ArrayList<>();
            t[node].add(a[l]);
            return;
        }

        int mid = (l+r)/2;
        build(2*node,l,mid);
        build(2*node+1,mid+1,r);
        if(t[node] == null) t[node] = new ArrayList<>();
        t[node].addAll(mergeAndSort(node));
    }

    private static List<Integer> mergeAndSort(int node){
        List<Integer> l = t[2*node];
        List<Integer> r = t[2*node+1];
        List<Integer> ans = Stream.concat(l.stream(), r.stream())
                .sorted()
                .collect(Collectors.toList());
        return ans;
    }

    private static int query(int node, int l, int r, int val, int start, int end){
        if(l > end || r < start) return 0;
        if(l >= start && r <= end) {
            return binarySearch(1,t[node].size(),val,convertListToArray(t[node]));
        }

        int mid = (l+r)/2;
        return query(2*node,l,mid,val,start,end)+query(2*node+1,mid+1,r,val,start,end);
    }

    private static int binarySearch(int l, int r, int val, int[] a){
        if(r<1 || l>r || l>a.length || a[l]>=val) return 0;
        if(a[r]<val) return r-l+1;

        int mid = (l+r)/2;
        return binarySearch(l,mid,val,a) + binarySearch(mid+1,r,val,a);
    }

    private static int [] convertListToArray(List<Integer> l){
        int len = l.size();
        int [] a = new int[len+1];
        a[0] = 0;
        for(int i=0; i<len; i++){
            a[i+1] = l.get(i);
        }
        return a;
    }
}
