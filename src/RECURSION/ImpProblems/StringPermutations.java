package RECURSION.ImpProblems;
import java.util.*;
public class StringPermutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        permute1(s, "");
        permute(s,0);

    }
//Method 1
    static void permute1(String s, String ans) {
        if (s.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            String left = s.substring(0, i);
            String right = s.substring(i + 1);

            permute1(left + right, ans + ch);
        }
    }
//Method 2
    static void permute(String str, int i) {
        if (i == str.length() - 1)
            System.out.println(str);
        else {
            for (int j = i; j <= str.length() - 1; j++) {
                str = swap(str, i, j);
                permute(str, i + 1);
                str = swap(str, i, j);
            }
        }
    }
    static String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}