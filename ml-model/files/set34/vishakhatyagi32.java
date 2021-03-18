import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int n = queries.length;
        int ans[] = new int[n];
        for(int temp=0;temp<n;temp++)
        {
            int x = queries[temp];
            ans[temp] = a[(x-k+10000*a.length)%a.length];

        }
        return ans;
    }

}
