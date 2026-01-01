package RECURSION.Basics;

public class PowerOfNumber {
    public static void main(String[] args){
        System.out.println(reverseExponentiationHelper(5,5));
    }
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
}
