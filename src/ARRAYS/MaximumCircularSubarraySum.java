package ARRAYS;

import java.util.*;

public class MaximumCircularSubarraySum {

    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    static int maxCircularSumNaive(int arr[], int n) {

        int res = arr[0];

        for (int i = 0; i < n; i++) {

            int curr_max = arr[i];
            int curr_sum = arr[i];

            for (int j = 1; j < n; j++) {

                int index = (i + j) % n;

                curr_sum += arr[index];
                curr_max = Math.max(curr_max, curr_sum);
            }

            res = Math.max(res, curr_max);
        }

        return res;
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    static int maxCircularSumOptimized(int arr[]) {

        int maxsub = arr[0];
        int ans = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxsub = Math.max(maxsub + arr[i], arr[i]);
            ans = Math.max(ans, maxsub);
        }

        if (ans < 0)
            return ans;

        int arraymax = 0;
        for (int i = 0; i < arr.length; i++) {
            arraymax += arr[i];
        }

        int minsub = arr[0];
        int possible = arr[0];

        for (int i = 1; i < arr.length; i++) {
            minsub = Math.min(minsub + arr[i], arr[i]);
            possible = Math.min(possible, minsub);
        }

        arraymax = arraymax - possible;

        ans = Math.max(arraymax, ans);

        return ans;
    }

    public static void main(String args[]) {

        int arr[] = {5, -2, 3, 4};
        int n = arr.length;

        System.out.println("Naive Solution: " + maxCircularSumNaive(arr, n));
        System.out.println("Optimized Solution: " + maxCircularSumOptimized(arr));
    }
}
