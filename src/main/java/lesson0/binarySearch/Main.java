package lesson0.binarySearch;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = fill();
        Arrays.sort(arr);
        System.out.println("your array: " + Arrays.toString(arr));

        System.out.println("10: " + binarySearchContains(0, arr.length - 1, 10, arr));
        System.out.println("1: " + binarySearchContains(0, arr.length - 1, 1, arr));
        System.out.println("5: " + binarySearchContains(0, arr.length - 1, 5, arr));
        System.out.println("6: " + binarySearchContains(0, arr.length - 1, 6, arr));
        System.out.println("11: " + binarySearchContains(0, arr.length - 1, 11, arr));
        System.out.println("13: " + binarySearchContains(0, arr.length - 1, 13, arr));
        System.out.println("-5: " + binarySearchContains(0, arr.length - 1, -5, arr));
        System.out.println("8: " + binarySearchContains(0, arr.length - 1, 8, arr));
        System.out.println("-------------------------------------");
        System.out.println("index of 10: " + binarySearchFindIndex(0, arr.length - 1, 10, arr));
        System.out.println("index of 1: " + binarySearchFindIndex(0, arr.length - 1, 1, arr));
        System.out.println("index of 5: " + binarySearchFindIndex(0, arr.length - 1, 5, arr));
        System.out.println("index of 6: " + binarySearchFindIndex(0, arr.length - 1, 6, arr));
        System.out.println("index of 11: " + binarySearchFindIndex(0, arr.length - 1, 11, arr));
        System.out.println("index of 13: " + binarySearchFindIndex(0, arr.length - 1, 13, arr));
        System.out.println("index of -5: " + binarySearchFindIndex(0, arr.length - 1, -5, arr));
        System.out.println("index of 8: " + binarySearchFindIndex(0, arr.length - 1, 8, arr));
    }

    private static int[] fill() {
        System.out.print("type number of elements: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] arr = new int[n];
        Random random = new Random();
        for(int i=0; i<n; i++){
            arr[i] = random.nextInt(20) - 10;
        }
        return arr;
    }

    public static boolean binarySearchContains(int left, int right, int target, int [] arr){
        if(left > right || left < 0 || right >= arr.length) return false;

        int mid = (left + right) / 2;
        if(arr[mid] == target) return true;
        else if (arr[mid] < target) return binarySearchContains(mid+1, right, target, arr);
        else return binarySearchContains(left, mid-1, target, arr);
    }

    public static int binarySearchFindIndex(int left, int right, int target, int [] arr){
        if(left > right || left < 0 || right >= arr.length) return -1;

        int mid = (left + right) / 2;
        if(arr[mid] == target) return mid;
        else if (arr[mid] < target) return binarySearchFindIndex(mid+1, right, target, arr);
        else return binarySearchFindIndex(left, mid-1, target, arr);
    }
}
