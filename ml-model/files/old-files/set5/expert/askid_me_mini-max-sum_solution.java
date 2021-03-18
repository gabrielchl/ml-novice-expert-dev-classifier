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
int temp;
        for(int i = 1; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(arr[i]> arr[j]){
                 temp = arr[i];
                 arr[i] = arr[j];
                 arr[j]=temp;
                }
            }
        }
     long min = ((long)arr[1] + (long)arr[2] + (long)arr[3] + (long)arr[4]);
        long max = ((long)arr[0] + (long)arr[1] + (long)arr[2] + (long)arr[3]);
        System.out.println(min + " " + max);

    }

}
