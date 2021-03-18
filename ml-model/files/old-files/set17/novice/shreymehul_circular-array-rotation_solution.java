import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int z,t;
        z=k%a.length;
        if(z==0){
            z=a.length;
        }
        for(int j=0; j<z; j++){
            t=a[a.length-1];
            for(int i=a.length-1;i>0;i--){

                a[i]=a[i-1];
            }
            a[0]=t;
        }
        int b[]= new int[queries.length];
        int l=0;
        for(int m=0; m<queries.length; m++){
            b[l]=a[queries[m]];
            l++;
        }
        return b;
    }

}
