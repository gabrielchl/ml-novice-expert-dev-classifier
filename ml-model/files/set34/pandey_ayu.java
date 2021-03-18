import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int b[]=new int[a.length];
        int ans[]=new int[queries.length];
        int n=a.length;
      if(k>n)
      k=k%n;
      for(int i=0;i<n;i++)
      {
        if(k+i>=n)
        {
            int c=(k+i)%n;
            b[c]=a[i];
        }
        else
          b[k+i]=a[i];

      }
      for(int i=0;i<queries.length;i++)
      {
          int d =queries[i];
          ans[i]=b[d];
      }
    return ans;
    }

}
