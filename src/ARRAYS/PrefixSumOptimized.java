package ARRAYS;

public class PrefixSumOptimized {

    static int[] prefix;

    public static void buildPrefix(int[] arr){
        prefix = new int[arr.length];
        prefix[0] = arr[0];

        for(int i = 1; i < arr.length; i++){
            prefix[i] = arr[i] + prefix[i-1];
        }
    }

    public static int getSum(int l, int r){
        if(l == 0){
            return prefix[r];
        }
        return prefix[r] - prefix[l-1];
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};

        buildPrefix(arr);

        System.out.println(getSum(1,3));
        System.out.println(getSum(0,4));
    }
}