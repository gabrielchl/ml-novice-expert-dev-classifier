import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int f=k%a.length;
        if(a.length>k)
        {
            if(k>(a.length/2))
            {
                int s=a.length-k;
                int b=1;
                while(b<=s)
                {
                    int p=a[a.length-1];
                    a[a.length-1]=a[0];
                    int i=0;
                    while(i<=a.length-3)
                    {
                        a[i]=a[i+1];
                        i++;
                    }
                    a[a.length-2]=p;
                    b++;
                }
            }
            else
            {
                int r=1;
                while(r<=k)
                {
                    int p= a[0];
                    a[0]=a[a.length-1];
                    int i=a.length-2;
                    while(i>=0)
                    {
                        a[i+1]=a[i];
                        i--;
                    }
                    a[1]=p;
                    r++;
                }
            }

        }
        else if(f==0)
        {
            int i=0;
        }
        else
        {
             int r=1;
             while(r<=f)
            {
                int p= a[0];
                a[0]=a[a.length-1];
                int i=a.length-2;
                while(i>=0)
                {
                    a[i+1]=a[i];
                    i--;
                }
                a[1]=p;
                r++;
            }
        }
        int arr[]=new int[queries.length];
        int i=0;
        while(i<queries.length)
        {
            int m=queries[i];
            arr[i]=a[m];
            i++;
        }
        return arr;

    }

}
