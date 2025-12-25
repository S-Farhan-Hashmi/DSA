package RECURSION.ImpProblems;
import java.util.*;
public class GenerateSubSetsArray {
    public static void main(String[] args){
        int[] arr = {1,2,3};
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ans(arr,list,result,0);
        System.out.println(result);
    }
    static void ans(int[] arr , ArrayList<Integer> list ,ArrayList<ArrayList<Integer>> result, int i  ){
        if(i==arr.length){
            result.add(new ArrayList<>(list));
            return;
        }
        ans(arr,list,result,i+1);
        list.add(arr[i]);
        ans(arr,list,result,i+1);
        list.removeLast();
    }
}
