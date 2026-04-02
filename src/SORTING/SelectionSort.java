package SORTING;
import java.util.*;
public class SelectionSort {
    public static void main(String[] args){
        int[] arr ={10,5,8,20,2,18};
        for(int i =0;i<arr.length-1;i++){
            int min =i;
            for(int j =i;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            swap(i,min,arr);
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int i , int j , int[] arr){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
