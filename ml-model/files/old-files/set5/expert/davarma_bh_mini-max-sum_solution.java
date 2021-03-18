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
        Arrays.sort(arr);
        long sum1=0, sum2=0;
        for(int i=0;i<arr.length-1;i++){
            sum1 = sum1 + arr[i];
        }
        System.out.print(sum1+" ");
        for(int i=1;i<=arr.length-1;i++){
            sum2 = sum2 + arr[i];
        }
        System.out.print(sum2);
    }

}
