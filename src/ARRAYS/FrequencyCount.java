package ARRAYS;

import java.util.*;

class FrequencyCount {

    static List<Integer> frequencyCount(int[] arr) {

        int n = arr.length;
        int[] freq = new int[n];

        for (int i = 0; i < n; i++) {
            freq[arr[i] - 1]++;
        }

        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ans.add(freq[i]);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 3, 5};
        List<Integer> result = frequencyCount(arr);
        System.out.println(result);
    }
}
