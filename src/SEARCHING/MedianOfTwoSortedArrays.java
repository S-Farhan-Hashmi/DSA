package SEARCHING;
//TC=O(log(min(m,n)))
//SC=O(1)
public class MedianOfTwoSortedArrays {

    public static int findMedian(int arr[], int n, int brr[], int m) {
        if (n <= m) {
            return ans(arr, n, brr, m);
        } else {
            return ans(brr, m, arr, n);
        }
    }

    public static int ans(int arr[], int n, int brr[], int m) {

        int n1 = n;
        int n2 = m;

        int start = 0;
        int end = n1;

        while (start <= end) {

            int i1 = start + (end - start) / 2;
            int i2 = ((n1 + n2 + 1) / 2) - i1;

            int max1 = (i1 == 0) ? Integer.MIN_VALUE : arr[i1 - 1];
            int min1 = (i1 == n1) ? Integer.MAX_VALUE : arr[i1];

            int max2 = (i2 == 0) ? Integer.MIN_VALUE : brr[i2 - 1];
            int min2 = (i2 == n2) ? Integer.MAX_VALUE : brr[i2];

            if (max1 <= min2 && max2 <= min1) {

                if ((n1 + n2) % 2 == 0) {
                    return (Math.max(max1, max2) + Math.min(min1, min2)) / 2;
                } else {
                    return Math.max(max1, max2);
                }

            } else if (max2 > min1) {
                start = i1 + 1;
            } else {
                end = i1 - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50};
        int brr[] = {5, 15, 25, 35, 45};

        int median = findMedian(arr, arr.length, brr, brr.length);
        System.out.println(median);
    }
}