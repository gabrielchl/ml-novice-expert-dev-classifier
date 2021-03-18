import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {

                int n = a.length;
                int arr[] = new int[queries.length];
                for(int i = 0 ; i<queries.length ; i++){
                    arr[i] = a[(n-(k%n)+queries[i])%n];
                }




            return arr;
    }

}
