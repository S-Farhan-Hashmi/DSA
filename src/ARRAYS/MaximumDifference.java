package ARRAYS;

class MaximumDifference {

    static int maximumDifference(int[] nums) {
        int maximum = -1;
        int minimum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            maximum = Math.max(maximum, nums[i] - minimum);
            minimum = Math.min(minimum, nums[i]);
        }

        if (maximum == 0) {
            return -1;
        }

        return maximum;
    }

    public static void main(String[] args) {
        int[] nums = {7, 1, 5, 4};
        int result = maximumDifference(nums);
        System.out.println(result);
    }
}
