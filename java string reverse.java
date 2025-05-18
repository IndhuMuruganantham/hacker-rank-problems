import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
            char c = 0;
    char d = 0;
    for (int i = A.length()-1; i >=0 ; i--) {
        c = A.charAt(i);
    } 
    for (int j  = 0; j < A.length(); j++) {
        d = A.charAt(j);
    }
    if (c==d) {
        System.out.println("Yes");
    }else{
        System.out.println("No");
    }
    }
}



