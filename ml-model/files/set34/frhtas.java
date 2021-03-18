import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int size = a.length;
        /*
        for (int i = 0; i < k; i++) {
            int[] newArray = new int[size];
            newArray[0] = a[size - 1];

            for (int j = 1; j < size; j++) {
                newArray[j] = a[j-1];
            }

            a = newArray;
        }
        */

        int[] newArray = new int[size];
        for (int i = 0; i < size; i++) {
            newArray[(i+k) % size] = a[i];
        }

        size = queries.length;
        for (int i = 0; i < size; i++) {
            queries[i] = newArray[queries[i]];
        }

        return queries;
    }

}
