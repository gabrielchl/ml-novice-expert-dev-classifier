import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] circularArrayRotation(int[] a, int k, int[] queries)
    {
        int[] arr=new int[queries.length];
        int n=a.length;
        int flag=0;
        for(int i:queries)
        {
            k=k%n;
            int q=n+i-k;
            q=(q)%n;
            arr[flag]=a[q];
            flag++;
        }
        return arr;
    }

}
