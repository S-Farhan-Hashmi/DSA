package ARRAYS;

import java.util.*;

public class SubarraySumNonNegative {

    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> ans = new ArrayList<>();
        int start = 0;
        int current = 0;

        for (int end = 0; end < arr.length; end++) {
            current += arr[end];

            while (current > target && start <= end) {
                current -= arr[start];
                start++;
            }

            if (current == target) {
                ans.add(start + 1);
                ans.add(end + 1);
                return ans;
            }
        }

        ans.add(-1);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        ArrayList<Integer> result = subarraySum(arr, target);

        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}
