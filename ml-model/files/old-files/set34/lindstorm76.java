import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int[] current = new int[a.length];
        // For each rotation, no need to rotate one at a time
        for (int j = 0; j < a.length; j++) {
            current[(j + k) % a.length] = a[j];
        }

        // Get item for each query wanted
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            result[i] = current[queries[i]];
        }
        return result;
    }

}
