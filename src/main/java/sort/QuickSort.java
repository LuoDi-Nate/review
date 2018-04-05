package sort;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1};

        sort(arr, 0, arr.length - 1);

        for (int i : arr) {
            System.out.print(i + ",");
        }

    }

    private static void sort(int[] arr, int low, int high) {
        if (low < high) {
            int partition = partition(arr, low, high);

            sort(arr, low, partition - 1);
            sort(arr, partition + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int first = arr[low];
        int oldLow = low;

        while (low < high) {
            while (low < high && arr[high] >= first) {
                high--;
            }


            while (low < high && arr[low] <= first) {
                low++;
            }

            if (low < high) {
                int tmp = arr[high];

                arr[high] = arr[low];

                arr[low] = tmp;
            }


        }
        int temp = arr[low];
        arr[low] = first;

        arr[oldLow] = temp;

        return low;
    }
}
