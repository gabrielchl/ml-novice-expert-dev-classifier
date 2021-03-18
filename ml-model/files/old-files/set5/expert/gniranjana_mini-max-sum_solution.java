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
        if(arr.length==0)
                return;

            long minSum = 0, maxSum = 0, n = arr.length;
            Arrays.sort(arr);
            for (int i = 0; i <= n - 1; i++) {
                if (i != n-1)
                    minSum += arr[i];
                if (i > 0)
                    maxSum += arr[i];
            }
            System.out.println(minSum + " " + maxSum);

    }
}
