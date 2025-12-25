package RECURSION.ImpProblems;
import java.util.*;
public class RopeCut {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(ans(n,a,b,c));
    }
    static int ans(int n ,  int a , int b , int c){
        if(n==0){
            return 0;
        }
        if (n<0){
            return -1;
        }
        int x = ans(n-a,a,b,c);
        int y = ans(n-b,a,b,c);
        int z = ans(n-c,a,b,c);
        int max =x;
        if(y>max){
            max=y;
        }
        if(z>max){
            max=z;
        }
        if(max==-1){
            return -1;
        }
        return max+1;
    }
}
