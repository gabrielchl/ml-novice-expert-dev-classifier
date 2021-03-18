import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int temp;
        int n = a.length;
        // for(int i=0;i<k;i++){
        //     temp = a[a.length-1];
        //     for(int j=a.length-1;j>0;j--){
        //         a[j] = a[j-1];
        //     }
        //     a[0] = temp;
        // }
         int[] newarr = new int[a.length];
        for(int i=0;i<n;i++){
            newarr[(i+k)%n] = a[i];
        }
        int[] result = new int[queries.length];
        for(int i=0;i<result.length;i++){
            result[i] = newarr[queries[i]];
        }
        return result;
    }

}
