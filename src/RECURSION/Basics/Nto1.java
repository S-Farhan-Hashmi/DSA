package RECURSION.Basics;

import java.util.Scanner;

public class Nto1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ans(n);

    }
    static void ans(int n){
        if(n<1){
            return;
        }
        System.out.print(n+" ");
        ans(n-1);
    }
}
