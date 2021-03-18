import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {
    public static int diagonalDifference(List<List<Integer>> arr) {
    int length = arr.size();
    int width = arr.get(0).size();
    int rlsum = 0;
    int lrsum = 0;
    // Right to left
    for (int i = 0; i < length; i++) {
        for (int j =0; j < width ; j++) {
        //System.out.println("RL Elements" + arr.get(i).get(j));
        if (i == j) {
            rlsum += arr.get(i).get(j);
        //    System.out.println("rlsum" +arr.get(i).get(j));
        }
        if ( (i+j) == (length-1)) {
            lrsum += arr.get(i).get(j);
        //    System.out.println("lrsum"+arr.get(i).get(j));
        }
    }
    }
    return Math.abs(rlsum - lrsum);  
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
