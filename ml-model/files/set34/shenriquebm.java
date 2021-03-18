import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int[] result = new int[queries.length];
        k = k%a.length;
        for (int i = 0 ; i < queries.length; i++) {
            int place = (queries[i] - k);
            if (place < 0) {
                place = a.length + place;
            }
            result[i] = a[place];
        }

        return result;
    }

}
