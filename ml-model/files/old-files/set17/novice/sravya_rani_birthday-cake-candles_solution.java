import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    static int solve(int n, int[] ar) {
        int i,j=0,c=0;
        for(i=0;i<n;i++)
        {
            if(ar[i]>j)
            {
                j=ar[i];
            }
        }
        for(i=0;i<n;i++)
        {
            if(j==ar[i])
                c++;
        }
        return c;

    }

}
