import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
               int l = a.length;
        int[] res = new int[queries.length];
        // Prints the rotated array from start position
        for (int i = 0; i < k; i++) {
            int a1 = a[l-1];
            for (int j= l-1;j>0;j--){
                a[j] = a[j-1];
            }
            a[0] = a1;
        }


         for (int i = 0;i<queries.length;i++){
            res[i] = a[queries[i]];

        }
        return res;

    }

}
