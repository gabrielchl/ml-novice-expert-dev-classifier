import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
     int b[]=new int [a.length],c[]=new int[queries.length];
     int p=1,i=1;
     while(p<=k){
     i=i%a.length+1;p++;
     }
     int t=0;
     for(int j=i-1;j<a.length;j++){
       b[j]=a[t];t++;
     }
     int h=0;
     for(int f=t;f<a.length;f++){
         b[h]=a[f];h++;
     }
    for(int l=0;l<queries.length;l++){
     c[l]=b[queries[l]];
    }
    return c;
    }

}
