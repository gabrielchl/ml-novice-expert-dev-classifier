import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
      int len_a = a.length;
      int len_queries = queries.length;
      int[] result = new int[len_queries];
      for(int i=0;i<len_queries;i++){
        int index = queries[i]-k;
        while(index<0){
          index+=len_a;
        }
        result[i] = a[index];
      }
      return result;
    }

}
