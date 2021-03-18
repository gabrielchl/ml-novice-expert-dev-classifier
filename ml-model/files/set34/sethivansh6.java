import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int l=a.length;
        int q=queries.length;


           int c=k%l;int n=l;

       for(int i=0;i<q;i++)
       {      int m=queries[i];
           queries[i]=a[(n - (k % n)+ m) % n];

       }
return queries;
    }

}
