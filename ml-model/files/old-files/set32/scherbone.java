import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] getHead(int[] a, int k) {
        int[] head = new int[k];
        int limit = a.length - k;
        for(int i = limit, j = 0; i < a.length; ++i, ++j)
            head[j] = a[i];
        return head;
    }

    static void rotateRight(int[] a, int k) {
        int[] head = getHead(a, k);
        for(int i = a.length - k - 1; i >= 0; --i)
            a[i+k] = a[i];
        // put head at start
        for(int i = 0; i < k; ++i)
            a[i] = head[i];
    }

    static int[] getQueryValues(int[] a, int[] queries) {
        int[] result = new int[queries.length];
        for(int i = 0; i < queries.length; ++i)
            result[i] = a[queries[i]];
        return result;
    }

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        if(k == a.length)
            return getQueryValues(a, queries);
        k = k % a.length;
        rotateRight(a, k);
        return getQueryValues(a, queries);
    }

}
