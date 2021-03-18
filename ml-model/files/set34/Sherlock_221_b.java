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
        int b[]=new int[a.length];
        int s=k%(a.length);
        System.out.println(s);
        int x=0;
        for(int i=s;i<a.length;i++)
        {
            b[i]=a[x++];
            System.out.print(b[i]+" ");
        }
        for(int i=0;i<s;i++)
        {
            b[i]=a[x++];
            System.out.print(b[i]+" ");
        }



        for(int i=0;i<queries.length;i++)
        {
            queries[i]=b[queries[i]];
        }
        return queries;
    }

}
