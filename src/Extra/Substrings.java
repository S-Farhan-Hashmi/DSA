import java.util.*;
public class Substrings {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        ans(s,"",0);

    }
    static void ans(String s , String x ,int i ){
        if(i==s.length()){
            System.out.print(x+" ");
            return;
        }
        ans(s,x,i+1);
        ans(s,x+s.charAt(i),i+1);
        System.out.print(x+" ");
    }
}
