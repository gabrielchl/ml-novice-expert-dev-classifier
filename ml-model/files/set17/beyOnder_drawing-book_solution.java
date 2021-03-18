import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    static int solve(int n, int p) {
         int first=0,last;
         for(int i=1;i<=p;i++){
             if(i%2==0){
                 first++;
             }
         }
         last=n/2-first;
         if(last<first){
             return last;
         }
         else{
             return first;
         }

    }

}
