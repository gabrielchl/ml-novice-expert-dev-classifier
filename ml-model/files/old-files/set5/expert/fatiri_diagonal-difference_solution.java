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
    int result1 = 0;
    int result2 = 0;
    int tampungan = arr.size()-1;
    for(int i=0; i<arr.size(); i++){
        result1 += arr.get(i).get(i);
        result2 += arr.get(i).get(tampungan-i);
    }

    return Math.abs(result1-result2);

    }

}
