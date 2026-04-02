package ARRAYS;

public class LongestEvenOddSubarray {

    public static int maxEvenOdd(int arr[]) {

        int ans = 1;
        int maximum = 1;

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] % 2 == 0) {

                if (arr[i + 1] % 2 != 0) {
                    maximum++;
                } else {
                    ans = Math.max(ans, maximum);
                    maximum = 1;
                }

            } else {

                if (arr[i + 1] % 2 == 0) {
                    maximum++;
                } else {
                    ans = Math.max(ans, maximum);
                    maximum = 1;
                }
            }
        }

        ans = Math.max(ans, maximum);

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {5, 10, 20, 6, 3, 8};

        int result = maxEvenOdd(arr);
        System.out.println(result);
    }
}
