import java.io.*;
import java.util.*;

public class Solution {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        k = k % a.length;
        int[] ret = new int[queries.length];
        for (int i = 0; i < k; i++) {
            int j, last;
            // Stores the last element of array
            last = a[a.length - 1];

            for (j = a.length - 1; j > 0; j--) {
                // Shift element of array by one
                a[j] = a[j - 1];
            }
            // Last element of array will be added to the start of array.
            a[0] = last;
        }
        for (int i = 0; i < queries.length; i++) {
            ret[i] = a[queries[i]];
        }
        return ret;
    }

}
