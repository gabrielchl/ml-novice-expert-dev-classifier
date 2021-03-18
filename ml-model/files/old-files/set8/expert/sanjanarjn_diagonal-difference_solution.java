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

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }

        int result = Result.diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
