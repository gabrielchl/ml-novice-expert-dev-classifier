import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        k %= a.length;
        reverse(a, 0, a.length-1);
        reverse(a, 0, k-1);
        reverse(a, k, a.length-1);
        int[] res=new int[queries.length];
        for(int i=0;i<queries.length;i++)
            res[i]=a[queries[i]];
        return res;
    }

    public static void reverse(int[] a, int start, int end) {
        while (start<end)
        {
          int temp=a[start];
          a[start]=a[end];
          a[end]=temp;
          start++;
          end--;
        }
      }

}
