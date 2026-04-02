package SEARCHING;

public class PeakElementProblems {

    // ---------------------------------
    // Solution 1 : Full Condition Check
    // ---------------------------------
    public static int findPeakElementMethod1(int[] nums) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            // Check if mid is peak
            if ((mid == 0 || nums[mid - 1] < nums[mid]) &&
                (mid == nums.length - 1 || nums[mid + 1] < nums[mid])) {
                return mid;
            }
            // Move left
            else if (mid > 0 && nums[mid - 1] > nums[mid]) {
                end = mid - 1;
            }
            // Move right
            else {
                start = mid + 1;
            }
        }

        return -1;
    }


    // ---------------------------------
    // Solution 2 : Optimal Slope Method
    // ---------------------------------
    public static int findPeakElementMethod2(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }


    // ---------------------------------
    // Main Method (Testing)
    // ---------------------------------
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 1};

        int peak1 = findPeakElementMethod1(arr);
        int peak2 = findPeakElementMethod2(arr);

        System.out.println("Peak Index (Method 1): " + peak1);
        System.out.println("Peak Index (Method 2): " + peak2);
    }
}