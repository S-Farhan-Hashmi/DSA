package RECURSION.ImpProblems;

public class SubsetSumBoolean {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int sum = 5;
        boolean result = subsetSum(arr, arr.length, sum);
        System.out.println(result);
    }
    static boolean subsetSum(int[] arr, int n, int sum) {
        if (sum == 0) {
            return true;
        }
        if (n == 0) {
            return false;
        }
        if (sum < 0) {
            return false;
        }
        boolean notTake = subsetSum(arr, n - 1, sum);
        boolean take = subsetSum(arr, n - 1, sum - arr[n - 1]);
        if (notTake == true || take == true) {
            return true;
        }
        return false;
    }
}
