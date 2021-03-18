import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String kangaroo(int x1, int v1, int x2, int v2) { 
        int i = 1;
        while(i > 0) {
           if((x1 < x2 && v1 < v2) || (x1 > x2 && v1 > v2)) {
               return "NO";
           } else if(x1 == x2 && i > 0)  {
               return "YES";
           } else {
               x1 = x1 + v1;
               x2 = x2 + v2;
           }
           i++;
       }
        return "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }
}
