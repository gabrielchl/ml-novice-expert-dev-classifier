import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
      int n=a.length;
      int[] b=new int[n];
      k=k%n;
      for(int i=0;i<n;i++){
        b[i]=a[(n-k+i)%n];
      }
      int[] result=new int[queries.length];
      for(int i=0;i<queries.length;i++){
        result[i]=b[queries[i]];
      }
      return result;
    }

}
