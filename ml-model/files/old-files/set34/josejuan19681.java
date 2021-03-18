import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
         int u [] = new int[a.length];
         int o = 0;
         for(int i = 0; i < a.length; i++)
             u[(i+k)%a.length] = a[i];

         for(int i = 0; i < queries.length; i++)
             queries[i] = u[queries[i]];

         return queries;
    }

}
