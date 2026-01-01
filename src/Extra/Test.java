package Extra;

public class Test {
    public static void main(String[] args) {
        int m = reverse(12);
        System.out.println(m);
        System.out.println(ans(12,12));

    }

    static int reverse(int n) {
        int sum = 0;
        int k = n;
        while (k > 0) {
            sum = (sum * 10)+ (k% 10);
            k = k / 10;
        }
        return sum;
    }
    static int ans(int n , int m){
        if(m<=0){
            return 1;
        }
        return n * ans(n,m-1);
    }
}