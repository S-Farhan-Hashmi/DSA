package ARRAYS;

class StockBuySell {

    // WORST METHOD (Recursive - Exponential Time)
    static int maxProfitRecursive(int[] price, int start, int end) {
        if (end <= start)
            return 0;

        int profit = 0;

        for (int i = start; i < end; i++) {
            for (int j = i + 1; j <= end; j++) {
                if (price[j] > price[i]) {
                    int curr_profit = price[j] - price[i]
                            + maxProfitRecursive(price, start, i - 1)
                            + maxProfitRecursive(price, j + 1, end);

                    profit = Math.max(profit, curr_profit);
                }
            }
        }

        return profit;
    }

    // BEST METHOD (Greedy - Linear Time)
    static int maxProfitGreedy(int[] price, int n) {
        int profit = 0;

        for (int i = 1; i < n; i++) {
            if (price[i] > price[i - 1]) {
                profit += price[i] - price[i - 1];
            }
        }

        return profit;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 8, 12};
        int n = arr.length;

        System.out.println("Recursive Profit: " +
                maxProfitRecursive(arr, 0, n - 1));

        System.out.println("Greedy Profit: " +
                maxProfitGreedy(arr, n));
    }
}
