import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {

        long sum[] = new long[arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j)
                    continue;

                sum[i] += arr[j];
            }
        }

        long maxSum = Long.MIN_VALUE;
        long minSum = Long.MAX_VALUE;
        for (long s : sum) {
            if (s > maxSum)
                maxSum = s;

            if (s < minSum)
                minSum = s;
        }

        System.out.println(minSum + " " + maxSum);
    }

}
