package SEARCHING;

public class FloorSquareRoot {

    public static int floorSqrt(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int ans = -1;
        int start = 1;
        int end = n;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid <= (n / mid)) {  // safe overflow check
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Floor square root of " + n + " is: " + floorSqrt(n));
    }
}