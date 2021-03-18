import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int[] result = new int[queries.length];
        int[] rotatedArray = new int[a.length];
        for(int x = 0; x < a.length; x++){
            rotatedArray[(x+k) % a.length ] = a[x];
        }

        for (int i = 0; i < queries.length; i++) {
            result[i] = rotatedArray[queries[i]];
        }
        return result;
    }

}
