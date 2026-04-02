
package SEARCHING;
import java.util.*;
public class InfinitelySizedArray {
    public static void main(String[] args){
    }
    public static int  naive(int[] arr , int x){
        int i =0;
        while(true){
            if(arr[i]==x){
                return i;
            }
            if(arr[i]>x){
                return -1;
            }
            i++;
        }
    }
    public static int efficient(int[] arr , int x){
        int i=0;
        if(arr[i]==x){
            return i;
        }
        i=1;
        while(arr[i]<x){
            i=i*2;
        }
        if(arr[i]==x){
            return i;
        }
        int start=(i/2)+1;
        int end=i-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==x){
                return mid;
            }
            else if(arr[mid]<x){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}
