package sort;

import common.PrintUtil;

public class Merge{
    private static int[] arr1 = new int[]{2, 3, 4, 5, 6, 7};
    private static int[] arr2 = new int[]{10, 20, 90, 180, 300};

    public static void main(String[] args) {

        PrintUtil.printArray("arr1", arr1);
        PrintUtil.printArray("arr2", arr2);

        int[] after = merge(arr1, arr2);

        PrintUtil.printArray("after", after);
    }

    private static int[] merge(int[] a, int[] b) {
        int point1 = 0;
        int point2 = 0;

        int[] newArr = new int[a.length + b.length];

        for (int i = 0; i < newArr.length; i++) {

            if (!isEnd(arr1, point1) && !isEnd(arr2, point2)) {
                if (arr1[point1] < arr2[point2]) {
                    newArr[i] = arr1[point1++];
                }else {
                    newArr[i] = arr2[point2++];
                }
                continue;
            }

            if (isEnd(arr1, point1)){
                newArr[i] = arr2[point2++];
                continue;
            }

            if (isEnd(arr2, point2)){
                newArr[i] = arr1[point1++];
            }
        }

        return newArr;
    }

    private static boolean isEnd(int[] arr, int point) {
        return point > arr.length - 1;
    }
}
