import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int solve(int n, int[] ar) {
        Arrays.sort(ar);
        for(int i=0;i<n;i++)
        {
            System.out.print(ar[i]+" ");
        }
        int old=ar[0];
        int c=1,max=0;
        for(int i=1;i<n;i++)
        {
            if(ar[i]==old)
                c++;
            else
            {
                c=1;
                old=ar[i];
            }
            if(c==2)
            {
                max++;
                c=0;
            }
        }
        return max;
    }

}
