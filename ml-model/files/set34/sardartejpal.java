import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int ar[] = new int[queries.length];
        int n = a.length;
        for(int i=0;i<queries.length;i++){
            int y = (queries[i]+n-(k%n))%n;
            // int y = ((queries[i]+k-1)%x);
            if(k==n)
                ar[i] = a[queries[i]];
            else
                ar[i] = a[y];
        }
        return ar;
    }

}
