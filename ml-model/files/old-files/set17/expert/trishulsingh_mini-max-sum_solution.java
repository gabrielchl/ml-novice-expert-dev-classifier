import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static void solve(int[] arr) {
        List list=Arrays.asList(arr);

       long min=arr[0];
       for(int i=1;i<arr.length;i++){
           if(arr[i]<min){
               min=arr[i];
           }
       }
       long max=arr[0];
       for(int j=1;j<arr.length;j++){
           if(arr[j]>max){
               max=arr[j];
           }
       }
       long sum=0;
       for(int k=0;k<arr.length;k++){
           sum=arr[k]+sum;
       }
      long maxsum=sum-min;
      long minsum=sum-max;
      System.out.print(minsum+" ");
       System.out.print(maxsum);


    }

}
