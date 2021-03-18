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
        Integer d1 =0,d2=0;
    for(int i=0; i<arr.size(); i++){
        d1+=arr.get(i).get(i);
        d2+=arr.get(arr.size()-i-1).get(i);
    }
    Integer result = d1-d2;
    if(result<0) result = -1*result;
    return result;

    }

}
