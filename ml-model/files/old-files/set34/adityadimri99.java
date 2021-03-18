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
        int  x[] = new int[a.length];
        int  y[] = new int[queries.length];
        int n = 0;
        for( int i =0  ; i < a.length ; i++)
        {
            n= (i+k)%a.length;
            x[n] = a[i];
        }
        for(int i = 0 ; i < queries.length ; i++)
        {
            y[i] = x[queries[i]];
        }
        return y;


    }

}
