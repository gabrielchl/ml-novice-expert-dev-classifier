import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int length = a.length;
        k = k % length;
        for(int i = 0; i < k; i++) {
            int temp  = a[0];
            int last = a[length - 1];
            for(int j = 0; j < length - 1; j++) {
                int temVar = temp;
                temp = a[j + 1];
                a[j + 1]  = temVar;
            }
            a[0] = last;
        }
        int numsOfQueries = queries.length;
        for(int i = 0; i < numsOfQueries; i++) {
            queries[i] = a[queries[i]];
        }
        return queries;
    }

}
