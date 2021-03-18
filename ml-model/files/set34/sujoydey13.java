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

        int[] result = new int[queries.length];

        for(int x=0;x<queries.length;x++){
            int m = queries[x];
            result[x] = a[(n-(k%n)+m)%n];
        }

        return result;

    }

}
