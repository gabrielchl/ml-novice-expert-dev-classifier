import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {

            if(a.length!=k){
                k=k%a.length;
                int[] tmp = new int[k];
                for(int i=a.length-k,j=0;i<a.length;i++,j++){
                    tmp[j] = a[i];
                }
                for(int i=a.length-k-1,j=0;i>=0;i--,j++){
                    a[a.length-j-1] = a[i];
                }
                for(int i=0;i<k;i++){
                    a[i]=tmp[i];
                }
            }
            int[] res = new int[queries.length];
            for(int index=0;index<queries.length;index++){
                res[index] = a[queries[index]];
            }
            return res;

    }

}
