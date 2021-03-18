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
        int rot = k % a.length;
        for(int i = 0; i < queries.length; i++ ) {
            int x = queries[i];
            if (x - rot >= 0)
                result[i] = a[x - rot];
            else
                result[i] = a[x - rot + a.length];
        }
        return result;
    }

}
