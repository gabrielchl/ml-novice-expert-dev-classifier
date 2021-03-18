import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        int sum1 =0;
        int sum2 =0;
        int value=0;
        for(int i = 0;i<arr.size();i++){
            List adf =new ArrayList();
            adf = arr.get(i);
           sum1 =sum1 + (Integer)adf.get(i);
        }
        for(int j = 0;j<arr.size();j++){
           List adf1 =new ArrayList();
            adf1 = arr.get(j);
           sum2 =sum2 + (Integer)adf1.get((arr.size()-1)-j);
        }
        value = Math.abs(sum1-sum2);
       return value;
    }

}
