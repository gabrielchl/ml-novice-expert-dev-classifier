import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int[] a1 = new int[a.length];
        int[] result = new int[queries.length];
        k = k % a.length;
        for (int i = 0; i < k ; i++){
            a1[i] = a[a.length - k + i];
        }
        for (int i = k; i < a.length; i++){
            a1[i] = a[i - k];
        }
        for (int i = 0; i < queries.length; i++){
            int take = -1;
            for (int j = 0; j < a1.length; j++){
                if (queries[i] == j) take = a1[j];
            }
            result[i] = take;
        }
        return result;
    }

}
