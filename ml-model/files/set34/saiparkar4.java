import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        // 1 2 3
        // 3 1 2
        // 2 3 1
        int rotated = k % a.length;

        int[] result = new int[queries.length];
        for(int i = 0; i < queries.length; i++) {
            if(queries[i] - rotated >= 0)
                result[i] = a[queries[i] - rotated];
            else
                result[i] = a[queries[i] - rotated + a.length];
        }
        return result;
    }

}
