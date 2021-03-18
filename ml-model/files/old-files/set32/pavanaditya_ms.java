import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int[] res = new int[queries.length];
        int index;
        k = k%a.length;
        if(a.length==1){
            for(int i=0;i<queries.length;i++){
                res[i] = a[0];
            }
        }
        else{
            for(int i=0;i<queries.length;i++){
                index = queries[i]-k;
                if(index<0)
                    index = index + a.length;
                res[i] = a[index];
            }
        }
        return res;
    }

}
