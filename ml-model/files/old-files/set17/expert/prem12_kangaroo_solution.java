import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

       static String solve(int x1, int v1, int x2, int v2) {
        String isPossible = "NO";
        if(x1 == x2 && v1 == v2)  isPossible="YES";
        else if(v1 > v2 && x2+v2 > x1+v1 ){
            int i = 2;
            while(true){
             if ((x1 + (v1 * i))  == (x2 + (v2 * i)) ){
             isPossible="YES";
             break;
             }
             if(x1 + (v1 * i)  > (x2 + (v2 * i)) )
             break;
             i++;
            }
        }
        else if(v1 < v2 && x1 < x1 && (x1 % (v2-v1)) == 0) {
           int i = 2;
            while(true){
             if ((x1 + (v1 * i))  == (x2 + (v2 * i)) ){
             isPossible="YES";
             break;
             }
             if(x2 + (v2 * i)  > (x1 + (v1 * i)) )
             break;
             i++;
            }
            }
        return isPossible;
        }

}
