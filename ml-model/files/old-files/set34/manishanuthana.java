import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int j=0;
        int n=a.length;
        int b[]=new int[n];
        k=k%n;
        for(int i=n-k;i<n;i++){
            b[j++]=a[i];
        }
        for(int i=0;i<n-k;i++){
            b[j++]=a[i];
        }
       int len=queries.length;
       int[] ans=new int[len];
       for(int i=0;i<len;i++){
           ans[i]=b[queries[i]];
       }
       return ans;

    }

}
