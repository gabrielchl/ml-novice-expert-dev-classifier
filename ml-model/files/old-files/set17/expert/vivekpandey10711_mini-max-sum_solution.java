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
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
           max =max+ arr[i];
        }
        for(int i=0;i<arr.length-1;i++){
           min =min+ arr[i+1];
        }
       System.out.println(max+" "+min);

    }

}
