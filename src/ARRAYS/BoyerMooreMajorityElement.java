package ARRAYS;

import java.util.*;

public class BoyerMooreMajorityElement {

    static class Solution {
        public int majorityElement(int[] nums) {
            int count = 1;
            int result = 0;

            for (int i = 1; i < nums.length; i++) {
                if (nums[i] == nums[result]) {
                    count++;
                } else {
                    count--;
                    if (count == 0) {
                        result = i;
                        count = 1;
                    }
                }
            }

            count = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[result] == nums[i]) {
                    count++;
                }
            }

            if (count > nums.length / 2) {
                return nums[result];
            }

            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Solution sol = new Solution();
        System.out.println(sol.majorityElement(arr));
    }
}
