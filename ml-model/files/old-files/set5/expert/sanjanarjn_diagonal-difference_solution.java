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

    public static int diagonalDifference(List<List<Integer>> arr)
    {
        int leftToRightSum = getLeftToRightSum(arr);
        int rightToLeftSum = getRightToLeftSum(arr);
        return Math.abs(leftToRightSum - rightToLeftSum);
    }

    private static int getLeftToRightSum(List<List<Integer>> arr)
    {
        int sum =0;
        int rowCount = arr.size();
        for(int i=0; i<rowCount; i++)
        {
            List<Integer> iRow = arr.get(i);
            sum += iRow.get(i);

        }
        return sum;
    }

    private static int getRightToLeftSum(List<List<Integer>> arr)
    {
        int sum =0;
        int rowCount = arr.size();
        int j = rowCount-1;
        for(int i=0; i<rowCount; i++)
        {
            List<Integer> iRow = arr.get(i);
            sum += iRow.get(j--);

        }
        return sum;
    }
}
