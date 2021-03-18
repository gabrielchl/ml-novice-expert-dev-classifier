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
        int result=0;
         if(p>n/2){
            int rev=n-p;
            if(rev>1){
                result=rev/2;
            }else if (n % 2 == 0 && rev == 1){
                result = 1;
            }
        }else if(p>1){
            result=p/2;
        }
        return result;

    }

}
