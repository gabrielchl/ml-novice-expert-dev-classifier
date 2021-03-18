import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
      int[] ans = new int[queries.length];
      System.out.println(a.length);
      int i =0;
        for(int q : queries) {
          int pos = (a.length + q - (k%a.length)) % a.length;
                System.out.println(i + " " +pos);
          ans[i] = a[pos];
          i++;
      }
    return ans;
    }

}
