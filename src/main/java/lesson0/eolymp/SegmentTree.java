package lesson0.eolymp;

import java.util.Scanner;

public class SegmentTree {
    /*
    6
    1 3 5 7 9 11
     */
    // https://www.hackerearth.com/practice/data-structures/advanced-data-structures/segment-trees/tutorial/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] arr = new int[n];
        int [] segmentTree = new int[n*2+1];

        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }
    }

    private static void build(){

    }

    private static int build1(int[] arr, int left, int right){
        if(left == right) {
            //System.out.println(left + " " + right + " " + arr[left]);
            return arr[left];
        }

        int mid = (left + right) / 2;
        int ans = build1(arr,left, mid) + build1(arr, mid+1, right);
        //System.out.println(left + " " + right + " " + ans);
        return ans;
    }
}
