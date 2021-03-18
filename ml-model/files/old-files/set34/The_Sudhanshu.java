import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {

        int z=0,len = a.length;
        int ro = k % len;
        int arr[] = new int[queries.length];
        for(int i : queries){
            arr[z++] = a[((len-ro +i)% len)];
        }
        return arr;

    }

}
