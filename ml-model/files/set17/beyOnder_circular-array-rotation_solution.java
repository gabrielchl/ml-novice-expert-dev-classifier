import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        k%=a.length;
        int[]b=new int[a.length];
        for(int i=0;i<a.length;i++){
            b[(i+k)%a.length]=a[i];
        }
        int ans[]=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            ans[i]=b[queries[i]];
        }
        return ans;

    }

}
