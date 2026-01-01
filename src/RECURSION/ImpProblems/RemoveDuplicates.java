package RECURSION.ImpProblems;
import java.util.*;
public class RemoveDuplicates {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        boolean[] arr = new boolean[26];
        System.out.println(ans(s,0,arr));


//        Iterative method
//        StringBuilder ans = new StringBuilder();
//
//        for (int i = 0; i < s.length(); i++) {
//            char ch = s.charAt(i);
//
//            if (ch < 'a' || ch > 'z') continue; // safety
//
//            if (!arr[ch - 'a']) {
//                arr[ch - 'a'] = true;
//                ans.append(ch);
//            }
//        }
//
//        System.out.println(ans.toString());
    }
    static String ans(String s , int i , boolean[] arr){
        if(i==s.length()){
            return "";
        }
        char y = s.charAt(i);
        if(arr[y-'a']){
            return ans(s,i+1,arr);
        }
        arr[y-'a']=true;
        return y+ans(s,i+1,arr);
    }
}
