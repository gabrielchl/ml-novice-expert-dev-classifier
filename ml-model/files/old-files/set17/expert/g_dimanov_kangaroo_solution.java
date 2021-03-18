import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static String solve(int x1, int v1, int x2, int v2) {
       String answer = "";

        while (true) {
            if ((x1 > x2 && v1 >= v2) || (x2 > x1 && v2 >= v1)) {
                answer = "NO";
                break;
            } else {
                boolean checker = false;
               if(x1 < x2) {
                   while(x1 < x2) {
                       x1 += v1;
                       x2 += v2;
                       if(x1 == x2) {
                           answer = "YES";
                           checker = true;
                           break;
                       }
                   }
                   if(checker) break;
                   answer = "NO";
                   break;
               }
               else {
                   while(x2 < x1) {
                       x1 += v1;
                       x2 += v2;
                       if(x1 == x2) {
                           answer = "YES";
                           checker = true;
                           break;
                       }
                   }
                   if(checker) break;
                   answer = "NO";
                   break;
               }
            }

        }
        return answer;

    }

}
