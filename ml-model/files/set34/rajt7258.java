import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {


    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int[] ar=new int[queries.length];
        int temp=0;
        int n=a.length;
        temp=k%n;
         for (int i = 0; i < queries.length; i++) {
             int index = queries[i];
                 if (index - temp >= 0)
                     ar[i]=a[index - temp];
                else
                     ar[i]=a[index - temp + a.length];
        }
        return ar;
    }


}
