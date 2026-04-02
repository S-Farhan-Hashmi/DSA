import java.util.*;

public class MergeFunction {
    public static void main(String[] args){

        int[] arr = {1,2,4,5,6};

        int low = 0;
        int high = arr.length - 1;
        int mid = (low + high) / 2;

        int[] left = new int[mid - low + 1];
        int[] right = new int[high - mid];

        for(int i = 0; i < left.length; i++){
            left[i] = arr[low + i];
        }

        for(int j = 0; j < right.length; j++){
            right[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = low;

        while(i < left.length && j < right.length){
            if(left[i] <= right[j]){
                arr[k++] = left[i++];
            }
            else{
                arr[k++] = right[j++];
            }
        }

        while(i < left.length){
            arr[k++] = left[i++];
        }

        while(j < right.length){
            arr[k++] = right[j++];
        }

        System.out.println(Arrays.toString(arr));
    }
}