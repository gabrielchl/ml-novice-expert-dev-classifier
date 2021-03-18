import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        for(int i=1; i<=k; i++) {
            int v = a[a.length-1];
            for(int j=a.length-1; j>=1; j--) {
                a[j] = a[j-1];
            }
            a[0] = v;
        }
        int b[] = new int[queries.length];
        for(int q=0; q<queries.length; q++) {
            b[q] = a[queries[q]];
        }
    return b;
    }

}
