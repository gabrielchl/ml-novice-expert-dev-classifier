import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {

        int temp=a[1];
        int b[] = new int[a.length];//b[0]=
        for(int i=0;i<a.length;i++) {
            b[(i+k)%a.length]=a[i];
        }
        int res[]=new int[queries.length];
        for(int i=0;i<queries.length;i++) {
            res[i]=b[queries[i]];
        }
        return res;
    }

}
