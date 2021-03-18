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

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
