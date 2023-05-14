package lesson0.eolymp;

import java.util.Arrays;
import java.util.Scanner;

public class Pr5084 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] a = new int[n+1];
        for(int i=1; i<=n; i++){
            a[i] = in.nextInt();
        }
        Arrays.sort(a);
        int q = in.nextInt();
        int l,r,x;
        for(int i=1; i<=q; i++){
            l = in.nextInt();
            r = in.nextInt();
            x = in.nextInt();
            System.out.println(binarySearch(l,r,x,a));
        }
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
