import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static void solve(int[] arr) {
    long min = 0;
    long max = 0;
    long sum = 0;
    min = arr[0];
    for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
            if(arr[i]>max){
                max = arr[i];
            }
            sum += arr[i];
         }

    long exceptMax = sum - max;
    long exceptMin = sum - min;
    System.out.print(exceptMax+" "+exceptMin);

    }

}
