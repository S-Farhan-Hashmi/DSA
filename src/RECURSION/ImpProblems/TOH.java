package RECURSION.ImpProblems;

public class TOH {
    public static void main(String[] args){
        ans(3,'A','B','C');
    }
    static void ans(int n, char src , char aux , char dest){
        if(n==1){
            System.out.println("Move 1 from"+src+"to"+dest);
            return;
        }
        ans(n-1,src,dest,aux);
        System.out.println("Move"+n+"from"+src+"to"+dest);
        ans(n-1,aux,src,dest);
    }
}
//Number of steps in TOH=2^n-1;
