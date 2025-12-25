package RECURSION.Basics;
import java.util.*;
public class Palindrome1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int start = 0;
        int end = a.length()-1;
        System.out.println(ans(a,start,end));
    }
    static boolean ans(String a , int start , int end){
        if(start>=end){
            return true;
        }
        if(a.charAt(start)==a.charAt(end)){
            return ans(a,start+1,end-1);
        }
        return false;
    }
}

