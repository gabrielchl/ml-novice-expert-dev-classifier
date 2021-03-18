import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the circularArrayRotation function below.
    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int[] out = new int[queries.length];
        int[] a1 = new int[a.length];
        for(int i=0; i<a.length; i++){
            int value =(i+k)%a.length;
            a1[value]= a[i];
        }
        for(int i=0; i<queries.length; i++)
            out[i]=a1[queries[i]];
        return out;
    }

}
