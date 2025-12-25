package RECURSION.ImpProblems;
import java.util.Scanner;
public class GenerateSubSetsStrings {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        ans(a,"",0);
    }
    static void ans(String a , String b , int i){
        if(i==a.length()){
            if(b.isEmpty()){
                System.out.print("''"+ " ");
            }
            else{
            System.out.print(b+ " ");}
            return;
        }
        ans(a,b,i+1);
        ans(a,b+a.charAt(i),i+1);
    }
}
