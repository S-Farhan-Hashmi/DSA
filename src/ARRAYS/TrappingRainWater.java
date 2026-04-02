package ARRAYS;

import java.util.*;

public class TrappingRainWater {

    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    public static int maxWaterBrute(int arr[]) {

        int ans = 0;

        for (int i = 1; i < arr.length - 1; i++) {

            int max1 = 0;
            int max2 = 0;

            for (int j = 0; j < i; j++) {
                if (arr[j] > max1 && arr[j] > arr[i]) {
                    max1 = arr[j];
                }
            }

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > max2 && arr[j] > arr[i]) {
                    max2 = arr[j];
                }
            }

            int max = Math.min(max1, max2);
            int sum = max - arr[i];

            if (sum > 0) {
                ans += sum;
            }
        }

        return ans;
    }

    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static int maxWaterPrefix(int arr[]) {

        if (arr.length == 0) return 0;

        int n = arr.length;
        int ans = 0;

        int[] lmax = new int[n];
        int[] rmax = new int[n];

        lmax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            lmax[i] = Math.max(lmax[i - 1], arr[i]);
        }

        rmax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rmax[i] = Math.max(rmax[i + 1], arr[i]);
        }

        for (int i = 0; i < n; i++) {
            ans += Math.min(lmax[i], rmax[i]) - arr[i];
        }

        return ans;
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static int maxWaterTwoPointer(int arr[]) {

        int left = 0;
        int right = arr.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int ans = 0;

        while (left <= right) {

            if (arr[left] <= arr[right]) {

                if (arr[left] >= leftMax) {
                    leftMax = arr[left];
                } else {
                    ans += leftMax - arr[left];
                }
                left++;

            } else {

                if (arr[right] >= rightMax) {
                    rightMax = arr[right];
                } else {
                    ans += rightMax - arr[right];
                }
                right--;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {3, 0, 2, 0, 4};

        System.out.println("Brute Force O(n^2): " + maxWaterBrute(arr));
        System.out.println("Prefix O(n) Space: " + maxWaterPrefix(arr));
        System.out.println("Two Pointer O(1) Space: " + maxWaterTwoPointer(arr));
    }
}
