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
int total = n/2;
        int right = p/2;
        int left = total - right;
        if(right < left){
            return right;
        }
        else {
            return left;
        }
    }
}
