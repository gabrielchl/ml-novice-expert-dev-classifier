import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        if(k!=a.length){
        while(k>0){
            int temp=a[a.length-1];
            for(int i=a.length-1;i>=1;i--){
                a[i]=a[i-1];
            }
            a[0]=temp;
            k--;
        }
        }
        //System.out.println(Arrays.toString(a));
        int res[]=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            res[i]=a[queries[i]];
        }
        return res;
    }

}
