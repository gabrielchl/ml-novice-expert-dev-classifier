import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
            int n = a.length;
            int[]res = new int[queries.length];

         for(int m = 0; m < queries.length; m++){
             res[m]= a[(n - (k % n)+ queries[m]) % n];
         }

        return res;
    }

}
