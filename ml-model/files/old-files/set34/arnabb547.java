import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int start=0;
        start=start-k;
        start=Math.abs(start);
        start=a.length-start%a.length;
        if(start==a.length)
            start=0;
        int len=queries.length;
        int[] ans=new int[len];
        for(int i=0;i<len;i++){
            ans[i]=a[(start+queries[i])%a.length];
        }
        return ans;

    }

}
