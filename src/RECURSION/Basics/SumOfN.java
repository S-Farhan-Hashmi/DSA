package RECURSION.Basics;
import java.util.*;
public class SumOfN {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(ans(n));

    }
    static int ans(int n){
        if(n<=1){
            return 1;
        }
        return n+ans(n-1);
    }
}
