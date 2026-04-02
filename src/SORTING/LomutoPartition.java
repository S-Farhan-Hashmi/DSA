package SORTING;
import java.util.*;
public class LomutoPartition {
    public static void main(String[] args){
        int[] arr={10,80,30,90,40,50,70};
        int pivot =arr.length-1;
        int i=-1;
        for(int j=0;j<arr.length-1;j++){
            if(arr[j]<=arr[pivot]){
                swap(arr,++i,j);
            }
        }
        swap(arr,++i,pivot);
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] arr,int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
