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
        int[] q=new int[queries.length];
        int length=a.length;
        k%=length;
        for(int i=0;i<queries.length;i++)
        {
            queries[i]=(queries[i]-k+length)%length;
            q[i]=a[queries[i]];

        }
        return q;
    }

}
