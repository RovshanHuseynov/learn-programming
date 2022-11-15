package lesson0.binarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("type number of elements: ");
        int n = in.nextInt();
        int [] arr = new int[n];
        System.out.print("type sorted elements with space: ");
        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("10: " + binarySearch(0, arr.length - 1, 10, arr));
        System.out.println("1: " + binarySearch(0, arr.length - 1, 1, arr));
        System.out.println("5: " + binarySearch(0, arr.length - 1, 5, arr));
        System.out.println("6: " + binarySearch(0, arr.length - 1, 6, arr));
        System.out.println("11: " + binarySearch(0, arr.length - 1, 11, arr));
        System.out.println("13: " + binarySearch(0, arr.length - 1, 13, arr));
        System.out.println("-5: " + binarySearch(0, arr.length - 1, -5, arr));
        System.out.println("8: " + binarySearch(0, arr.length - 1, 8, arr));
    }

    public static boolean binarySearch(int left, int right, int target, int [] arr){
        if(left > right || left < 0 || right >= arr.length) return false;
        int mid = (left + right) / 2;

        if(arr[mid] == target) return true;
        else if (arr[mid] < target) return binarySearch(mid+1, right, target, arr);
        else return binarySearch(left, mid-1, target, arr);
    }
}
