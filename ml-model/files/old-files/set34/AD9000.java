import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        // Calculate "zero" of the array
        int z = a.length - k % a.length;
        for (int i = 0; i < queries.length; i++)
        {
            queries[i] = a[(z + queries[i]) % a.length];
        }
        return queries;
    }

}
