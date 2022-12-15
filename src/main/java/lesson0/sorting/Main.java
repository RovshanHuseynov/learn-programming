package lesson0.sorting;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1,2,3,0,-1,-3,-2, Integer.MAX_VALUE};
        System.out.println(Arrays.toString(array));
        QuickSort qs = new QuickSort();
        qs.quickSort(array, 0, array.length);
        System.out.println(Arrays.toString(array));
    }
}
