package SORTING;
import java.util.*;
public class MergeSort {
    public static void main(String[] args){
        int[] arr ={1,2,3,1,1,3,3,3,5,7};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSort(int[] arr , int low , int high){
        if(low<high){
            int mid=low+(high-low)/2;
            mergeSort(arr,low,mid);
            mergeSort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
    }
    public static void merge(int[] arr , int low , int mid , int high){
        int[] left = new int[mid-low+1];
        int[] right=new int[high-mid];
        for(int i = 0; i <left.length;i++){
            left[i]=arr[low+i];
        }
        for(int i =0; i <right.length;i++){
            right[i]=arr[mid+i+1];
        }
        int i =0;
        int j =0;
        int k=low;
        while(i<left.length && j<right.length){
            if(left[i]<=right[j]){
                arr[k++]=left[i++];
            }
            else{
                arr[k++]=right[j++];
            }
        }
        while(i<left.length){
            arr[k++]=left[i++];
        }
        while(j<right.length){
            arr[k++]=right[j++];
        }
    }
}
