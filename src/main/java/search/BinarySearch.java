package search;

public class BinarySearch {

    private static int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 111, 11111, 111111};

    public static void main(String[] args) {
        int i = binSearch(arr, 10, 0, arr.length - 1);

        System.out.println(i);
    }

    private static int binSearch(int[] arr, int target, int low, int high) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        if (low >= high) {
            return -1;
        }

        int mid = (high + low) / 2;

        if (target == arr[mid]){
            return mid;
        }

        if (target > arr[mid]) {
            return binSearch(arr, target, mid + 1, high);
        }else {
            return binSearch(arr, target, low, mid - 1);
        }
    }
}
