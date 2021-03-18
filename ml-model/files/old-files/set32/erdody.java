import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int[] r = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int ri = ((queries[i] - k) % a.length + a.length) % a.length;
            r[i] = a[ri];
        }

        return r;
    }

}
