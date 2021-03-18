import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the pageCount function below.
     */
    static int pageCount(int n, int p) {
        int i,count=0;
        if(n-p==1 || n-p==0 || p==1){
            count= 0;
            return count;
        }
       for(i=1;i<n;i++){
           if(i==p ){
               count= i;
               return count;
           }else if(i==p-1){
               count= i;
               return count;
           }
           else{
               i++;
               p--;
               if(i==p){
                    i--;
                    count= i;
                    return count;
               }
           }
       }
       return count;
    }
}
