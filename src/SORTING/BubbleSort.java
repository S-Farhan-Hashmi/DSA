package SORTING;
import java.util.*;
public class BubbleSort {
    public static void main(String[] args){
        int[] arr={2,3,1,6,5,9,8,7};
        for(int i =0; i <arr.length-1;i++){
            boolean swapped = false;
            for(int j =0 ; j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]) {
                    swap(j, j + 1, arr);
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int j , int i , int[] arr){
        int temp = arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }
}
