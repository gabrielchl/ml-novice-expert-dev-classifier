import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {

        int n=queries.length;
        int m=a.length;
        int b[]=new int[n];
        for(int i=0;i<n;i++)
        {
            b[i]=a[(m-(k%m)+queries[i])%m];
        }
        return b;
    }

}
