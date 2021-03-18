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
        long min=0,max=0;
        for(int i=0;i<4;i++){
            min+=arr[i];
        }
        max=min+arr[4]-arr[0];
        System.out.println(min+" "+max);
    }

}
