package ARRAYS;

class LeftRotateArray {

    // Helper method used by worst approach
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    static void leftRotateByOne(int[] arr, int n) {
        int temp = arr[0];
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }
        arr[n - 1] = temp;
    }

    // WORST METHOD
    // Rotates array left by one, d times
    // Time Complexity: O(n * d)
    // Space Complexity: O(1)
    static void leftRotateWorst(int[] arr, int d, int n) {
        for (int i = 0; i < d; i++) {
            leftRotateByOne(arr, n);
        }
    }

    // BETTER METHOD
    // Uses temporary array to store first d elements
    // Time Complexity: O(n)
    // Space Complexity: O(d)
    static void leftRotateTempArray(int[] arr, int d, int n) {
        int[] temp = new int[d];

        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }

        for (int i = 0; i < d; i++) {
            arr[n - d + i] = temp[i];
        }
    }

    // Helper method for best approach
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    static void reverse(int[] arr, int low, int high) {
        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }

    // BEST METHOD
    // Reversal Algorithm
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    static void leftRotateBest(int[] arr, int d, int n) {
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }

    static void printArray(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};
        int[] arr3 = {1, 2, 3, 4, 5};
        int d = 2;
        int n = arr1.length;

        System.out.println("Worst Method:");
        leftRotateWorst(arr1, d, n);
        printArray(arr1);

        System.out.println("Better Method:");
        leftRotateTempArray(arr2, d, n);
        printArray(arr2);

        System.out.println("Best Method:");
        leftRotateBest(arr3, d, n);
        printArray(arr3);
    }
}
