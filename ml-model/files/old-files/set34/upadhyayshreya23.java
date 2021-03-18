import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int l = a.length;
        int[] sol = new int[queries.length];
        int[] b = new int[l];
        int i=0;
        if(k>l){
            k=k%l;
        }
        for(int b_i=Math.abs(l-k);b_i<l;b_i++){
            b[i]=a[b_i];
            i++;
        }
        for(int b_i=0;b_i<(Math.abs(l-k));b_i++)
        {
            b[i]=a[b_i];
            i++;
        }
        for(int j=0;j<queries.length;j++){
            sol[j]=b[queries[j]];
        }
        return sol;
    }

}
