package lesson0.eolymp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Pr1150 {
    static int [] a;
    static List<Integer>[] t;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        a = new int[n+1];
        t = new ArrayList[4*n+1];
        for(int i=1; i<=n; i++){
            a[i] = in.nextInt();
        }
        build(1,1,n);
        //Arrays.stream(t).forEach(i ->System.out.println(i));
        int l,r,ind;
        for(int i=1; i<=m; i++){
            l = in.nextInt();
            r = in.nextInt();
            ind = in.nextInt();
            //query(1,1,n,l,r).stream().sorted().forEach(val -> System.out.print(val + " "));
            //System.out.println();
            System.out.println(query(1,1,n,l,r).stream()
                    .sorted().collect(Collectors.toList()).get(ind-1));
        }
    }

    private static void build(int node, int l, int r){
        if(l > r || r < 1) return;

        if(l == r){
            t[node] = new ArrayList<>();
            t[node].add(a[l]);
            return;
        }

        int mid = (l+r)/2;
        build(2*node,l,mid);
        build(2*node+1,mid+1,r);
        if(t[node] == null) t[node] = new ArrayList<>();
        t[node].addAll(mergeAndSort(t[2*node], t[2*node+1]));
    }

    private static List<Integer> mergeAndSort(List<Integer> leftNode, List<Integer> rightNode){
        return Stream.concat(leftNode.stream(), rightNode.stream())
                .sorted()
                .collect(Collectors.toList());
    }

    private static List<Integer> query(int node, int l, int r, int start, int end){
        //System.out.println(node + " " + l + " " + r + " " + start + " " + end);
        if(l > end || r < start) return new ArrayList<>();
        if(l >= start && r <= end) return new ArrayList<>(t[node]);

        int mid = (l+r)/2;
        List<Integer> res = new ArrayList<>();
        res.addAll(query(2*node,l,mid,start,end));
        res.addAll(query(2*node+1,mid+1,r,start,end));
        return res;
    }
}
