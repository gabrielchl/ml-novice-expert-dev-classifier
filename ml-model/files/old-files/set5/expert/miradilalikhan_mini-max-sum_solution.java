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
     long min = (long)arr[0]+ (long)arr[1]+(long)arr[2]+arr[3];
     long max = (long)arr[arr.length -1]+(long)arr[arr.length -2]+(long)arr[arr.length -3]+(long)arr[arr.length -4];
     System.out.println(min+" "+max);

    }
}
