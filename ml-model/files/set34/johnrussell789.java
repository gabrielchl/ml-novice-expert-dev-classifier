import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {

        // Skip rotations that will result in the array returning to its original state
        k %= a.length;

        // Shift each value from a k spots
        int[] newArr = new int[a.length];
        for(int i = 0; i < a.length; i++){
            newArr[(i + k) % a.length] = a[i];
        }
        a = newArr;

        // Query values
        int[] queryResults = new int[queries.length];
        for(int q = 0; q < queries.length; q++){
            queryResults[q] = a[queries[q]];
        }

        return queryResults;

    }

}
