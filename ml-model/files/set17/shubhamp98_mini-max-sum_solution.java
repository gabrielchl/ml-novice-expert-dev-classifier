import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static void solve(int[] arr) {
        long minSum = 0, maxSum = 0;
        int temp, newTemp;
        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i = 0; i < arr.length; i++) {
            //System.out.println(arr[i]);
            if(i > 0) {
                maxSum += arr[i];
            }
            if(i < arr.length-1) {
                minSum += arr[i];
            }
        }
        System.out.print(minSum + " " + maxSum);
    }

}
