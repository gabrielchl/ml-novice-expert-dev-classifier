import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int[] ans = new int[queries.length];
        int[] rotArr = new int[a.length];
        k = k % a.length;
        int idx = 0;
        for (int i = 0; i < a.length; i++) {
            rotArr[(k + i) % a.length] = a[i];
        }

        for (int i = 0; i < queries.length; i++) {
            ans[i] = rotArr[queries[i]];
        }
        return ans;
    }

}
