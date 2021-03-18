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
          int[] arr = new int[queries.length];
          for(int i=0;i<queries.length;i++){
              if(queries[i]-k>=0)
                    arr[i]=a[queries[i]-k];
              else
                    arr[i]=a[queries[i]-k+a.length];
          }
          return arr;
    }

}
