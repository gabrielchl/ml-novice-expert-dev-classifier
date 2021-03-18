import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static void solve(int[] arr) {
        long min=arr[0],max=arr[0],sum=0;
        for(int i=0;i<arr.length;i++){
           if(arr[i]<min){
               min=arr[i];
           }else if(arr[i]>max){
               max=arr[i];
           }
         sum+=arr[i];
        }
        long minsum=sum-max;long maxsum=sum-min;
       System.out.println(minsum+" "+maxsum);

    }

}
