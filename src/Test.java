public class Test {
    public static int maxEvenOdd(int arr[]) {
        //  code here
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
            ans=Math.max(ans,maximum);
        }
        return ans;
    }
    public static void main(String[] args){
        int[] arr = {10, 12, 14, 7, 8};
        System.out.println(maxEvenOdd(arr));
    }
}
