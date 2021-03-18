import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p)
    {
        int n=p.length;
        int b[] = new int[n];
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==p[j])
                {
                    b[i-1]=j+1;
                }
            }
        }
        int c[] =new int[n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(b[i]==p[j])
                {
                    c[i]=j+1;
                }
            }
        }
        return c;
    }

}
