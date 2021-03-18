import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.lang.Math;


class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
        int sum1=0,sum2=0;
        for(int i=0;i<arr.size();i++)
        {
           for(int j=0;j<arr.size();j++)
           {
              if(i==j)
                sum1+=arr.get(i).get(j);
              if(i+j==arr.size()-1)
                sum2+=arr.get(i).get(j);
           }
        }
        int result =Math.abs(sum1-sum2);
        return result;
    }

}
