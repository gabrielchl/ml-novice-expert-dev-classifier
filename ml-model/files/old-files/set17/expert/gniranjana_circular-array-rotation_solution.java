import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] solve(int[] a, int k, int[] queries) {
    int[] revArry = new int[a.length];
        int len = a.length-1;
        int rvPtr = a.length-1;
        for (int j = 0; j < k ; j++)
        {
            for (int i = 0 ; i < a.length;i++)
            {
                revArry[i] = a[rvPtr];
                if (rvPtr == a.length-1) rvPtr= 0;
                else rvPtr++;
            }
            if(j != k-1) {
                a=revArry;
                revArry = new int[a.length];
                rvPtr = a.length-1;
            }
        }
        int[] arrToRet = new int[queries.length];
        for (int i = 0; i < queries.length;i++) {
            arrToRet[i] = revArry[queries[i]];
        }
        return arrToRet;

        // return revArry;

    }

}
