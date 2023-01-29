import java.util.Arrays;

public class Exep {
    public static void main(String[] args) throws BinarySearchException {
        int[] arr  = {4,1,34,41,33,2,3};
        int[] arr1  = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(arr));
        search(arr,2);
        System.out.println(Arrays.toString(arr));
        search(arr1,2);
    }

    public static int search(int[] arr, int num) throws BinarySearchException {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                throw new BinarySearchException("Array is not sorted");
            }
        }
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (arr[middle] == num) {
                return middle;
            } else if (arr[middle] < num) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }
}
class BinarySearchException extends Exception {
    public BinarySearchException(String message) {
        super(message);
    }
}
