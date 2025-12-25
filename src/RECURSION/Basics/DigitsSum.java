package RECURSION.Basics;
import java.util.*;
public class DigitsSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(ans(n,0));
    }
    static int ans(int n , int sum){
        if(n==0){
            return sum;
        }
        int k = n%10;
        sum=sum+k;
        n=n/10;
        return ans(n,sum);
    }
}
