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
        int l = a.length;
        String s = "";
        for(i = 0;i<l;i++)
        {
            s = s+ Integer.toString(a[i]);
        }
        for(i=0;i<k;i++)
        {
            s = s.charAt(l-1) + s.substring(0,l-1);
        }
        for(i=0;i<l;i++)
        {
            a[i] = Integer.valueOf(s.substring(i,i+1));
        }
        return a;
        }

}
