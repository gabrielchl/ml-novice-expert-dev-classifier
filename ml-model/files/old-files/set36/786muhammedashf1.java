import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int n=p.length;
        int[] ar=new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=indexOf(p,i+1);
        }
        for(int i=0;i<n;i++)
        {
            ar[i]=indexOf(p,ar[i]);
        }
        return ar;
    }
    public static int indexOf(int[] a,int ele)
    {
        int n=a.length;
        int r=-1;
        for(int i=0;i<n;i++)
        {
            if(a[i]==ele)
            {
                r=i+1;
            }
        }
    return r;
    }

}
