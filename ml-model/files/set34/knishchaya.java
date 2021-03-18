import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int aCount = a.length;
        int queryCount = queries.length;

        int[] result = new int[queryCount];

        for (int i = 0; i < queryCount; i++) {
            int queryValue = queries[i];

            if (k > aCount) {
                k = k % aCount;
            }

            result[i] = a[Math.abs(aCount - k + queryValue) % aCount];
        }

        return result;


    }

}
