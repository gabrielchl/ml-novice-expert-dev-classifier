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
        int m=queries.length;
        int[] b = new int[n];
        int[] result=new int[m];
        int l=k%n;
        if(l==0)
            l=n;
        for(int i=0;i<n-l;i++)
        {
            b[i+l]=a[i];
        }
        int p=0;
        for(int i=n-l;i<n;i++)
        {
            b[p]=a[i];
            p++;
        }

        for(int i=0;i<m;i++)
        {
            result[i]= b[queries[i]];
        }

        return result;
    }

}
