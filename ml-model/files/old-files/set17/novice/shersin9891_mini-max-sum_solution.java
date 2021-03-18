import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static void solve(int[] arr) {
        Arrays.sort(arr);
        long min = 0;
        long max =0;
        for(int i =0;i<arr.length-1;i++){
            min = min+arr[i];
            max=max+arr[i+1];
        }
        System.out.println(min+" "+max);


    }

}
