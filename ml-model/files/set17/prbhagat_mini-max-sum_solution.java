import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java. util. Arrays;

public class Solution {

    static void solve(int[] arr) {
         Arrays.sort(arr);
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

}
