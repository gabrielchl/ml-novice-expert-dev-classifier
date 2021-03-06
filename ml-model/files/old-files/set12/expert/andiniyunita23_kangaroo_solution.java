import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String kangaroo(int x1, int v1, int x2, int v2) {
        // Complete this function
        
        int max = (v1 * v2);
        
        for (int i=0; i<max; i++) {
            int k1 = (i * v1) + x1;
            int k2 = (i * v2) + x2;
            
            if (k1 == k2) {
                return "YES";
            }else {
                if (i == (max-1)) {
                    return "NO";
                }
            }
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
