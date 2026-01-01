package RECURSION.ImpProblems;
import java.util.*;
public class Josephusproblem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(ans(n,k));
    }
    static int ans(int n , int k ){
        if(n==1){
            return 0;
        }
        return((ans(n-1,k)+k)%n);
    }
}
// for qns with index starting with 1 just add one after final answer revealed