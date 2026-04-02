package SORTING;
import java.util.*;
public class NaivePartition {
    public static void main(String[] args){
        int[] arr={5,13,6,9,12,11,8};
        int p=6;
        int[] temp=new int[arr.length];
        int count=0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]<=arr[p] && i!=p) {
                temp[count++]=arr[i];
            }
        }
        temp[count++]=arr[p];
        for(int i =0;i<arr.length;i++){
            if(arr[i]>arr[p]){
                temp[count++]=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=temp[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
