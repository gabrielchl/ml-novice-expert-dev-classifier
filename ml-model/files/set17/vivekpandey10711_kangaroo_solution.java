import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static String solve(int x1, int v1, int x2, int v2) {
        int sum1 =x1;
        int sum2 =x2;
        String re = null;
        if(x1<x2 && v1>v2){
              while(sum1 != sum2){
               sum1 = sum1+v1;
              sum2=sum2+v2;
              if(sum1>sum2){
                   return re = "NO";
              }else
              re = "YES";
              }
        }else{
            re = "NO";
        }
         return re;
    }

}
