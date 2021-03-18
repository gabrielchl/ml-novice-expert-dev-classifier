import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        Map<Integer,Integer> mp = new HashMap<>();
        int n = a.length;
        for(int i=0;i<n;i++)
        {
            mp.put((i+k)%n,a[i]);
        }
        Set<Integer> s = mp.keySet();
        Iterator<Integer> itr = s.iterator();
        while(itr.hasNext())
        {
            int j = itr.next();
            a[j] = mp.get(j);
        }
        int[] res = new int[queries.length];
        for(int i=0;i<queries.length;i++)
        {
            res[i] = a[queries[i]];
        }
     return res;
    }

}
