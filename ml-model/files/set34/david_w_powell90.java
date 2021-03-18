import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int[] ret = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            ret[i] = (a[(a.length - (k % a.length) + queries[i]) % a.length]);
        }
        return ret;
    }

}
