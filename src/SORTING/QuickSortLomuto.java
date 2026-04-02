package SORTING;
import java.util.*;
public class QuickSortLomuto {
    public static void main(String[] args){
        int[] arr={8,4,7,9,3,10,5};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int arr[],int low , int high){
        if(low<high){
            int pivot = lomutoPartion(arr,low,high);
            quickSort(arr,low,pivot-1);
            quickSort(arr,pivot+1,high);
        }
    }
    public static int lomutoPartion(int[] arr,int low,int high){
        int pivot=high;
        int i=low-1;
        for(int j =low;j<high;j++){
            if(arr[j]<=arr[pivot]){
                swap(arr,++i,j);
            }
        }
        swap(arr,++i,pivot);
        return i;
    }
    public static void swap(int[] arr , int i , int j){
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }
}
