import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the circularArrayRotation function below.
    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int arr[] = new int[a.length];

            for(int i=0 ; i<a.length ; i++)
                arr[(i+k)%a.length] = a[i];

            for(int i=0 ; i<queries.length ; i++)
                queries[i] = arr[queries[i]];

            return queries;


    }

}
