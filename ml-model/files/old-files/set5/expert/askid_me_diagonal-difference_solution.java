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
    int x =0;
        int y =0;
        List<Integer> row = new ArrayList();
        for(int i = 0; i < arr.size(); i++){
            row = arr.get(i);
            for(int j = 0; j <row.size(); j++ ){
                x += row.get(j+i);
                y += row.get(row.size()-i-1);
                break;
            }

        }
        return Math.abs(x-y);
    }

}
