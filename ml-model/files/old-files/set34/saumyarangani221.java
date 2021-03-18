import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int rot=k%a.length;
        int arr[]=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int idx=queries[i];
             if (idx - rot >= 0)
            arr[i]=a[idx - rot];
        else
            arr[i]=a[idx - rot + a.length];
        }
        return arr;
        }

}
