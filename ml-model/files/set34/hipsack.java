import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {

        int n =a.length;
        int q=queries.length;
        int r=k%n;
        int[] rotArray = new int[n];
        int[] resArray = new int[q];
        for(int x= 0; x<n; x++){
            rotArray[x] = a[(n-r)%n];
            r--;
        }
        for(int i=0; i<q; i++)
            resArray[i] = rotArray[queries[i]];
        return resArray;
    }

}
