package sort;

import common.PrintUtil;

public class MergeSort {
    private static int[] arr = new int[]{1, 2, 3, 435, 56, 345, 3, 56, 7, 657, 3, 5};

    public static void main(String[] args) {

        mSort(arr, 0, arr.length - 1);

        PrintUtil.printArray("after", arr);
    }

    public static void mSort(int arr[], int left, int right) {
        if (left >= right) return;

        int mid = (left + right) / 2;

        mSort(arr, left, mid);
        mSort(arr, mid + 1, right);

        merge(arr, left, mid, right);
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int oriLeft = left;

        int first = left;
        int second = mid + 1;

        int[] tmp = new int[right - left + 1];

        int cnt = 0;
        while (first <= mid && second <= right) {
            tmp[cnt++] = arr[first] < arr[second] ? arr[first++] : arr[second++];
        }

        while (first <= mid) {
            tmp[cnt++] = arr[first++];
        }

        while (second <= right) {
            tmp[cnt++] = arr[second++];
        }

        for (int i = 0; i < tmp.length; i++) {
            arr[oriLeft++] = tmp[i];
        }
    }
}
