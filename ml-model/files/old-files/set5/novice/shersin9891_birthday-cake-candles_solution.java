import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the birthdayCakeCandles function below.
    static int birthdayCakeCandles(int[] ar) {
        int m = max(ar);
        int count = 0;
        for(int i =0;i<ar.length;i++){
            if(ar[i]==m)
              count++;
        }
        return count;

    }
    public static int max(int[] a){
        int m = a[0];
        for(int i = 1;i<a.length;i++){
            if(a[i]>m){
                m=a[i];
            }
        }
        return m;
    }

}
