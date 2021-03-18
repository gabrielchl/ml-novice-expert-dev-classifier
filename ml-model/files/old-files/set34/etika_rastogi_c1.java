import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int r[]=new int[queries.length];
        for(int i = 0; i < queries.length; i++){
       // int m = in.nextInt();
       int n=a.length;
        r[i]=(a[(n - (k % n)+ queries[i]) % n]);
    }
    return r;
    }

}
