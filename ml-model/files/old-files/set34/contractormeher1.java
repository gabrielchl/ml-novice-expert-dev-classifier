import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int t=a[a.length-1];
        int []y=new int[queries.length];
        int[] as = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            as[(i + k) % a.length] = a[i];
        }
        for (int i = 0; i < a.length; i++) {
            a[i] = as[i];
        }
        for(int i=0;i<queries.length;i++)
        {
         y[i]=a[queries[i]];
        }
return y;

    }

}
