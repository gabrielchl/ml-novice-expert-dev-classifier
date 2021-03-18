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
        int rot=k%a.length;
        int i=0;
        int[] res=new int[queries.length];
        for(int q:queries)
        {
            if(q-rot>=0)
            {
                res[i++]=a[q-rot];
            }else
            {
                res[i++]=a[q-rot+a.length];
            }
        }
        return res;
    }

}
