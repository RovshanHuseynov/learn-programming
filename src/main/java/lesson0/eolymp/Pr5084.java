package lesson0.eolymp;

import java.util.Arrays;
import java.util.Scanner;

public class Pr5084 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] a = new int[n+1];
        int [] b;
        for(int i=1; i<=n; i++){
            a[i] = in.nextInt();
        }
        int q = in.nextInt();
        int l,r,x;
        for(int i=1; i<=q; i++){
            l = in.nextInt();
            r = in.nextInt();
            x = in.nextInt();

            b = new int[r-l+2];
            int cnt=0;
            for(int j=l; j<=r; j++){
                b[++cnt] = a[j];
            }
            Arrays.sort(b);
            System.out.println(binarySearch(1,(r-l+1),x,b));
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
