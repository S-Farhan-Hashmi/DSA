package RECURSION.Basics;
import java.util.*;
public class Fibonachi {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(ans(n));
    }
    static int ans(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return ans(n-1)+ans(n-2);
    }
}
