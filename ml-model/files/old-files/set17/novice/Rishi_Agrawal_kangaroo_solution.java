import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String solve(int x1, int v1, int x2, int v2) {
        int a=0,b=0,c=0;
        a=x1;
        b=x2;
        if(x1>=0 && x1<x2){
            if(v1>=1 && v2>=1){
       while((a!=100000)&&(b!=100000)){
           if(a==b){
               System.out.println("YES");
               c++;
               break;
           }
           a=a+v1;
           b=b+v2;
       }
           if(c==0){
               System.out.println("NO");
           }
           }
       }
    }

}
