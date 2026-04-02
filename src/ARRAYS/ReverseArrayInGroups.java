package ARRAYS;

import java.util.Arrays;

public class ReverseArrayInGroups {

    static void reverseInGroups(int[] arr, int k) {
        for (int i = 0; i < arr.length; i = i + k) {
            int start = i;
            int end;
            if ((i + k - 1) < (arr.length - 1)) {
                end = i + k - 1;
            } else {
                end = arr.length - 1;
            }
            while (start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 3;
        reverseInGroups(arr, k);
        System.out.println(Arrays.toString(arr));
    }
}
