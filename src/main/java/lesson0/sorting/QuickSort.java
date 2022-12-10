package lesson0.sorting;

public class QuickSort {
    public void quickSort(int[] arr, int l, int r){
        if(l>=r) return;

        int pivot = partition(arr,l,r);
        quickSort(arr, l, pivot-1);
        quickSort(arr, pivot+1, r);
    }

    private int partition(int[] arr, int l, int r){
        return 0;
    }
}
