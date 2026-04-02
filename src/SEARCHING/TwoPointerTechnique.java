package SEARCHING;

public class TwoPointerTechnique {
    public static void main(String[] args){
        int[] arr = {2,4,8,9,11,12,20,30};
        System.out.println(doublesum(arr,23));
        System.out.println(triplesum(arr,23));
    }
    public static boolean doublesum(int[] arr , int x){
        int low=0;
        int high=arr.length-1;
        while(low<high){
            int sum = arr[low]+arr[high];
            if(sum==x){
                return true;
            }
            else if(sum>x){
                high--;
            }
            else{
                low++;
            }
        }
        return false;
    }
    public static boolean triplesum(int[] arr,int x){
        for(int i =0 ;i < arr.length ;i++){
            int low=i+1;
            int high=arr.length-1;
            while(low<high){
                int sum=arr[i]+arr[high]+arr[low];
                if(sum==x){
                    return true;
                }
                else if(sum>x){
                    high--;
                }
                else{
                    low++;
                }
            }
        }
        return false;
    }
}
