import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void solve(int n, int[][] a) {
        int s=0,r=0,t=n-1;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j)
                    s+=a[i][j];
            }
        }


        for(int i=0;i<n;i++)
        {
            r+=a[i][t];
            t--;
        }

        if(r<s)
            System.out.println(s-r);
        else
            System.out.println(r-s);
    }
}
