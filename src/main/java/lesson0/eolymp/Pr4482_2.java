package lesson0.eolymp;

import java.util.Scanner;

public class Pr4482_2 {
    static int[] a;
    static long[] tGCD;
    static long[] tLCM;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        a = new int[n+1];
        tGCD = new long[4*n+4];
        tLCM = new long[4*n+4];
        for (int i = 1; i <= n; i++) {
            a[i] = in.nextInt();
        }
        build(1, 1, n);
        //System.out.println(Arrays.toString(t));
        int m = in.nextInt();
        int x, y, z;
        for (int i = 1; i <= m; i++) {
            x = in.nextInt();
            y = in.nextInt();
            z = in.nextInt();

            if (x == 1) {
                long gcd = queryGCD(1,1,n,y,z);
                long lcm = queryLCM(1,1,n,y,z);
                //System.out.println(gcd);
                //System.out.println(lcm);

                if(gcd < lcm) System.out.println("wins");
                else if(gcd == lcm) System.out.println("draw");
                else System.out.println("loser");
            } else {
                // update
                update(1, 1, n, y, z);
                //System.out.println(Arrays.toString(a));
                //System.out.println(Arrays.toString(t));
            }
        }
    }

    private static void build(int node, int l, int r) {
        if (l > r || r < 1) return;
        if (l == r) {
            tGCD[node] = a[l];
            tLCM[node] = a[l];
            return;
        }

        int mid = (l + r) / 2;
        build(2 * node, l, mid);
        build(2 * node + 1, mid + 1, r);
        tGCD[node] = gcd(tGCD[2*node], tGCD[2*node+1]);
        tLCM[node] = lcm(tLCM[2*node], tLCM[2*node+1]);
    }

    private static long queryGCD(int node, int l, int r, int start, int end) {
        if (r < start || l > end) return 0L;
        if (l >= start && r <= end) return tGCD[node];

        int mid = (l + r) / 2;
        return gcd(queryGCD(2*node,l,mid,start,end), queryGCD(2*node+1,mid+1,r,start,end));
    }

    private static long queryLCM(int node, int l, int r, int start, int end) {
        if (r < start || l > end) return 0L;
        if (l >= start && r <= end) return tLCM[node];

        int mid = (l + r) / 2;
        return lcm(queryLCM(2*node,l,mid,start,end), queryLCM(2*node+1,mid+1,r,start,end));
    }

    private static void update(int node, int l, int r, int ind, int val) {
        if (l > r || r < 1) return;

        if (l == r && l == ind) {
            a[l] = val;
            tGCD[node] = val;
            tLCM[node] = val;
            return;
        }

        int mid = (l + r) / 2;
        if (ind <= mid) {
            update(2 * node, l, mid, ind, val);
        } else {
            update(2 * node + 1, mid + 1, r, ind, val);
        }
        tGCD[node] = gcd(tGCD[2*node], tGCD[2*node+1]);
        tLCM[node] = lcm(tLCM[2*node], tLCM[2*node+1]);
    }

    private static long gcd(long a, long b) {
        while (b != 0) {
            a = a % b;
            a = b + a - (b = a);
        }
        return a;
    }

    private static long lcm(long a, long b) {
        if (a == 0 || b == 0) return Math.max(a, b);
        return a * b / gcd(a, b);
    }
}