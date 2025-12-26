package RECURSION;

public class Template {

    // =========================================
    // 1. BASIC RECURSION (Single return value)
    // =========================================
    // Pattern: Reduce the problem size

    static int basicRecursion(int n) {
        if (n == 0) return 0;     // base case
        return n + basicRecursion(n - 1);
    }

    // Used in:
    // - Sum of numbers
    // - Factorial
    // - Count digits
    // - Power (simple)

    // =========================================
    // 2. INDEX-BASED RECURSION (Array / String)
    // =========================================
    // Pattern: Move index forward

    static boolean indexRecursion(int[] arr, int i) {
        if (i == arr.length - 1) return true;
        if (arr[i] > arr[i + 1]) return false;
        return indexRecursion(arr, i + 1);
    }

    // Used in:
    // - Check sorted array
    // - Traverse array
    // - String traversal
    // - First uppercase letter

    // =========================================
    // 3. TWO-POINTER RECURSION
    // =========================================
    // Pattern: Shrink from both ends

    static void twoPointerRecursion(int[] arr, int l, int r) {
        if (l >= r) return;

        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;

        twoPointerRecursion(arr, l + 1, r - 1);
    }

    // Used in:
    // - Reverse array
    // - Palindrome check

    // =========================================
    // 4. DIVIDE & CONQUER (Pure recursion)
    // =========================================
    // Pattern: Divide problem into smaller parts

    static int divideAndConquer(int[] arr, int l, int r, int x) {
        if (l > r) return -1;

        int mid = l + (r - l) / 2;

        if (arr[mid] == x) return mid;
        if (arr[mid] > x)
            return divideAndConquer(arr, l, mid - 1, x);
        else
            return divideAndConquer(arr, mid + 1, r, x);
    }

    // Used in:
    // - Binary search
    // - Power (optimized)
    // - Merge sort logic

    // =========================================
    // 5. BACKTRACKING (Include / Exclude)
    // =========================================
    // Pattern: Choose → Recurse → Undo

    static void backtracking(int[] arr, int i, java.util.ArrayList<Integer> cur) {
        if (i == arr.length) {
            System.out.println(cur);
            return;
        }

        // Include
        cur.add(arr[i]);
        backtracking(arr, i + 1, cur);

        // Undo
        cur.remove(cur.size() - 1);

        // Exclude
        backtracking(arr, i + 1, cur);
    }

    // Used in:
    // - Subsets
    // - Subsequences
    // - Power set

    // =========================================
    // 6. BACKTRACKING (Multiple choices)
    // =========================================
    // Pattern: Loop over choices

    static void multiChoiceBacktracking() {
        /*
        if (base case) return;

        for (each choice) {
            make choice
            recurse
            undo choice
        }
        */
    }

    // Used in:
    // - Permutations
    // - Rat in a Maze
    // - Word Search
    // - Combination Sum
    // - N-Queens (later)

    // =========================================
    // ========= PURE RECURSION PATTERNS =========
    // =========================================

    /*
     1️⃣ Rope Cutting Problem
        Logic:
        - Try all possible cuts
        - Take max of recursive results
        - If all results < 0 → return -1
        Pattern: Multiple recursive calls + max

     2️⃣ Josephus Problem
        Logic:
        - f(n, k) = (f(n-1, k) + k) % n
        Pattern: Mathematical recursion

     3️⃣ Tower of Hanoi
        Logic:
        - Move n-1 disks to helper
        - Move largest disk
        - Move n-1 disks to destination
        Pattern: Trust recursion

     4️⃣ Subarray Generation (Recursive view)
        Logic:
        - Fix start index
        - Expand end index recursively
        Pattern: Two-level recursion

     5️⃣ K-th Symbol / Grammar Problems
        Logic:
        - Do NOT generate full sequence
        - Use index math
        Pattern: Index-based recursion

     6️⃣ String Cleanup Problems
        Logic:
        - Compare current char with next
        - Recurse on remaining string
        Pattern: Index-based recursion

     7️⃣ Grid Problems (Basic)
        Logic:
        - Move in all directions
        - Stop at boundary / invalid cell
        - Backtrack (unmark)
        Pattern: Multi-choice recursion
    */

    // =========================================
    // MAIN (Optional test)
    // =========================================
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        basicRecursion(3);
        indexRecursion(arr, 0);
        twoPointerRecursion(arr, 0, arr.length - 1);
        divideAndConquer(arr, 0, arr.length - 1, 2);
        backtracking(arr, 0, new java.util.ArrayList<>());
    }
}
