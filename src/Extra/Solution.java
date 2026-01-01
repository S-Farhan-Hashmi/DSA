package Extra;

class Solution {
    public static void main(String[] args){
        System.out.println(reverseExponentiation(5));
    }
    // Function to reverse the digits of the number
    static public int reverseNumber(int n) {
        int reversed = 0;
        while (n > 0) {
            reversed = reversed * 10 + n % 10;
            n = n / 10;
        }
        return reversed;
    }

    // Recursive function to compute base raised to the power of exponent
    static public int reverseExponentiationHelper(int base, int exponent) {
        if (base == 0) return 0;
        if (exponent == 0) return 1;

        int result;
        if (exponent % 2 == 0) {
            result = reverseExponentiationHelper(base, exponent / 2);
            return result * result;
        } else {
            result = reverseExponentiationHelper(base, exponent - 1);
            return base * result;
        }
    }

    // Main function to compute n raised to the power of its reverse
    static public int reverseExponentiation(int n) {
        int reversed = reverseNumber(n);
        return reverseExponentiationHelper(n, reversed);
    }
}