package lesson0.sorting;

public class Main {
    public static void main(String[] args) {
        int[] array = {1,2,3,0,-1,-3,-2};
        QuickSort qs = new QuickSort();
        qs.quickSort(array, 0, array.length);
    }
}
