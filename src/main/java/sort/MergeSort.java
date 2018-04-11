package sort;

public class MergeSort {
    private static int[] arr = new int[]{1, 2, 3, 435, 56, 345, 3, 56, 7, 657, 3, 5};

    public static void main(String[] args) {

    }

    private static void mergeSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }

        int mid = (left + right) / 2;

        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);

        merge(arr, left, mid, right);
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int temp[] = new int[right - left + 1];

        int leftPoint =0;
        int rightPoint =0;



    }
}
