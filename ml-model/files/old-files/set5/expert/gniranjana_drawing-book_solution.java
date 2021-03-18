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
        /*
         * Write your code here.
         */

         int rightVal = 0;
         int leftVal = 0;
         int arr[] = new int[n];
         int index = 0;
         for (int i = 0; i < n; i++){
             arr[i]=i;
             if(i == p) index = i;
         }
         leftVal = (n-1-index)/2;
         rightVal = (index-0)/2;
         return Math.min(rightVal, leftVal);

    }
}
