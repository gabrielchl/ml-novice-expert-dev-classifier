import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {

    k = k % a.length;
    int[] result = new int[queries.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = a[(queries[i] - k + a.length) % a.length];
    }

    return result;
    }

}
