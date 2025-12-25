package RECURSION.Basics;

import java.util.Scanner;

public class OnetoN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ans(n);
    }
    static void ans(int n){
        if(n<1){
            return;
        }
        ans(n-1);
        System.out.print(n+" ");
    }
}
