package lesson0.binarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("type number of elements: ");
        int n = in.nextInt();
        int [] arr = new int[n];
        System.out.print("4type elements with space: ");
        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(binarySearch(0, arr.length - 1, 10, arr));
    }

    public static boolean binarySearch(int left, int right, int target, int [] arr){
        return false;
    }
}
