package RECURSION.Basics;

public class DigitalRoot {
    public static void main(String[] args){
        System.out.println(digitalRoot(999999));

    }
    public static int digitalRoot(int n) {
        if (n < 10)
            return n;
        return digitalRoot(sumDigits(n));
    }

    static int sumDigits(int n) {
        if (n == 0)
            return 0;
        return (n % 10) + sumDigits(n / 10);
    }
}

