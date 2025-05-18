import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
         int sum = A.length() + B.length();
        System.out.println(sum);

        // 2. Print whether A is lexicographically larger than B
        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");

        // 3. Capitalize and print
        String a = A.substring(0, 1).toUpperCase() + A.substring(1);
        String b = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(a + " " + b);
    }
}



