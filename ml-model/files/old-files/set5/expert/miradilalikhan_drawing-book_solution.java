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
        if(p==1) return 0;
        int left=p/2,right=0;
        int lastPage=(n%2==0)?n+1:n;
        right=(lastPage-p)/2;
        int result= (left>right)?right:left;
        return  result;

    }

}
