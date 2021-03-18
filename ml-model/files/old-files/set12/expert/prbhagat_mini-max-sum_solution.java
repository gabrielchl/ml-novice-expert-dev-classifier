import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java. util. Arrays;

public class Solution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
         Arrays.sort(arr); 
        //System.out.println("Sorted" +Arrays.toString(arr));
        long min = 0;
        long max = 0;
        for (int i=0; i< arr.length-1; i++)
        {
            min += arr[i];
        }
        for (int j=1; j< arr.length; j++)
        {
            max += arr[j];
        }
        System.out.println(+ min +" " + max);
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
