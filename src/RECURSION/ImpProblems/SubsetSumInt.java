package RECURSION.ImpProblems;

public class SubsetSumInt {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(ans(arr, arr.length, 20));
    }
    static int ans(int[] arr, int n, int sum) {
        if (n == 0)
//            return sum == 0 ? 1 : 0; Terinary operator condition ? value_if_true : value_if_false
            if (sum == 0) {
                return 1;
            } else {
                return 0;
            }
        return ans(arr, n - 1, sum) + ans(arr, n - 1, sum - arr[n - 1]);
    }
}