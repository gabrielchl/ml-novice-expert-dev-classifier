import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution
{

    static void solve(int n, int[][] a)
    {
          int i,j;
        int d1=0;
        int d2=0;
             for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==j)
                    d1=d1+a[i][j];
                 if (i == n - j - 1)
                      d2 += a[i][j];
            }
             }
        int diff=d1-d2;
        System.out.println(""+Math.abs(diff));





             }


}
