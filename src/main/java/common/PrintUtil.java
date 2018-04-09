package common;

public class PrintUtil {
    public static void printArray(String array, int[] arr) {
        System.out.print(array + ":[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (!(i == arr.length - 1)) {
                System.out.print(", ");
            }
        }
        System.out.print("]");

    }
}
