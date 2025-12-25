package RECURSION.Basics;
import java.util.*;
public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a =  sc.nextLine();
        int k = a.length()-1;
        System.out.println(ans(a,k));

    }
    static boolean ans(String a, int k){
        int n =a.length()-1;
        if(k==0 || k ==1 ){
            return true;
        }
        if(a.charAt(k)==a.charAt(n-k)){
            return ans(a,k-1 );
        }
        return false;
    }
}
