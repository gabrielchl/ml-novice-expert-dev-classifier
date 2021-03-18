import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        k=k%a.length;

        int[] b= new int[a.length];

        for(int i=0;i<a.length;i++) {
            if(i<k) {
                b[i] = a[a.length - k + i];
            } else {
                b[i] = a[i-k];
            }
        }

        int[] res = new int [queries.length];

        for(int i=0;i<queries.length;i++) {
            res[i] = b[queries[i]];
        }

        return res;

    }

}
