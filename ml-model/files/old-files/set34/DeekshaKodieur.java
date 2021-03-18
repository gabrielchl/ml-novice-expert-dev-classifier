import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {

        int len = a.length;
        int size = queries.length;
        int [] arr = new int[size];
        int m=0;

        for(int i=0; i<size; i++)
        {
            m = queries[i];
            arr[i] = a[(len-(k%len)+m)%len];
        }
        return arr;
    }

}
