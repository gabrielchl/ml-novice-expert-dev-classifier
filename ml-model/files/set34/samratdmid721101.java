import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] circularArrayRotation(int[] a, int k, int[] queries)
    {
        int i;
        int []arr=new int[a.length];
        for(i=0;i<k;i++)
        {
            arr[i]=a[a.length-k+i];
        }
        for(int j=0;j<a.length-k;j++)
        {
            arr[i]=a[j];
        }
        int []q=new int[queries.length];
        for(int j=0;j<q.length;j++)
        {
            q[j]=arr[queries[j]];
        }
        return q;
    }

}
