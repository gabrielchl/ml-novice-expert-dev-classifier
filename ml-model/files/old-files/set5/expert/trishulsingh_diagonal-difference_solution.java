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
    // Write your code here

      Integer[][] array=new Integer[arr.size()][];
      int i=0;
      for(List<Integer> nestedList:arr){
          array[i++]=nestedList.toArray(new Integer[arr.size()]);
      }
      int l=0;
      int r=0;
      int sum=0;

      for(int m=0;m<arr.size();m++){
          for(int n=0;n<arr.size();n++){
              if(m==n){
                  l=l+array[m][n];
              }
              if((m+n)==arr.size()-1){
                  r=r+array[m][n];
              }
          }
      }
      sum=Math.abs(l-r);
      return sum;

    }

}
