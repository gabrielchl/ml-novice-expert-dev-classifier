import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
      k=k%a.length;
      int[] temp = Arrays.copyOfRange(a, a.length-k, a.length);
       for(int i=a.length-k-1;i>=0;i--){
           a[i+k]=a[i];
       }
        for(int i =0;i<k;i++){
          a[i]=temp[i];
       }
        int[] arr = new int[queries.length];
        for(int i=0;i<queries.length;i++){
                arr[i]=a[queries[i]];
        }
        return arr;

    }

}
