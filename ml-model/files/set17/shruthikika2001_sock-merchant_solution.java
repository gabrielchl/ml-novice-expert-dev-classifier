import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int solve(int n, int[] ar)
    { int a[]=new int[100];
    int s =0;
        for(int i =0;i<n;i++)
        {
            a[ar[i]-1]+=1;
        }
        for(int i=0;i<100;i++)
        {
            s+=a[i]/2;
        }
        return s;
    }

}
