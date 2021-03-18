import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static String solve(int x1, int v1, int x2, int v2) {
        int count1=0,count2=0;
        while(true){
           if(true){
               x1+=v1;
               count1++;
           }
           if(true){
               x2+=v2;
               count2++;
           }
           if(x1==x2 && count1==count2){

               return "YES";
           }
           if(x1<x2 && v1<=v2 ||x1>x2 && v1>=v2)
           {
                return "NO";

           }



        }

    }

}
