import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int qLen = queries.length;
        int res[] = new int[qLen];
        int temp=0;
        if(k>a.length)
            k = k%a.length;
        for(int i=0;i<qLen;i++){
        if(queries[i]<k)
            res[i] = a[(a.length-k+queries[i])];
        else
            res[i] = a[queries[i]-k];

        }
        return res;
    }
}
