package lesson0.sorting;

public class QuickSort {
    public void quickSort(int[] arr, int l, int r){
        if(l>=r) return;

        int pivot = partition(arr,l,r);
        quickSort(arr, l, pivot);
        quickSort(arr, pivot+1, r);
    }

    private int partition(int[] arr, int l, int r){
        int pivot  = arr[l];
        int i = l;
        int j = r;

        while (i < j) {
            do {
                i++;
            } while (arr[i] <= pivot);

            do {
                j--;
            } while (arr[j] >= pivot);

            if (i < j) {
                // swapping
                arr[i] = arr[i] + arr[j];
                arr[j] = arr[i] - arr[j];
                arr[i] = arr[i] - arr[j];
            }
        }
        // swapping
        arr[l] = arr[l] + arr[j];
        arr[j] = arr[l] - arr[j];
        arr[l] = arr[l] - arr[j];
        return j;
    }
}
