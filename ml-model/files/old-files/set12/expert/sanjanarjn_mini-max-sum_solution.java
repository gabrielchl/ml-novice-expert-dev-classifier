import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) 
    {
        long totalSum = 0;
        int size = arr.length;
        for(int i=0; i<size; i++)
        {
            totalSum += arr[i];
        }

        long miniSum = totalSum, maxSum = 0;
        for(int i=0; i<size; i++)
        {
            int element = arr[i];

            if(totalSum - element < miniSum)
                miniSum = totalSum - element;
            
            if(totalSum - element > maxSum)
                maxSum = totalSum - element;
        }
        System.out.println(miniSum+" "+maxSum);
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
