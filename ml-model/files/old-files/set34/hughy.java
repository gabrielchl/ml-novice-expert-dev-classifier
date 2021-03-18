import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
         System.out.println(Arrays.toString(a));
         System.out.println("rotating: " + k);
        //loop k

        int[] copy = new int[a.length];
        for(int i = 0; i < copy.length; i++){

            //0 1 2
            copy[(i + k) % a.length] = a[i];
        }
         System.out.println(Arrays.toString(copy));


        //loop queries and print the index of rotated array

        for(int i = 0; i < queries.length; i++){
            // System.out.println(copy[queries[i]]);
            queries[i] = copy[queries[i]];
        }

        return queries;
    }

}
