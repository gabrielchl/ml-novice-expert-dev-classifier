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
        int[] result_array = new int[queries.length];
        int[] rotatedArray = new int[n];
        for(int i=0; i< n ;i++)
        {
            rotatedArray[i] = a[(i+n-k%n)%n];
        }
        for(int i=0; i<result_array.length; i++)
        {
            result_array[i]= rotatedArray[queries[i]];
        }


        return result_array;

    }

}
