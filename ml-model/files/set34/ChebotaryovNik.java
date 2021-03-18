import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution
{
    public static int[] circularArrayRotation(int[] a, int k, int[] queries)
    {
        final int[] responses = new int[queries.length];
        if (a.length == 0 || queries.length == 0)
            return responses;
        final int offset = k % a.length;
        int i = 0;
        for (int query : queries)
            responses[i++] = circularArrayRotation(a, offset, query);
        return responses;
    }

    private static int circularArrayRotation(int[] a, int offset, int query)
    {
        int i = query - offset;
        if (i < 0)
            i += a.length;
        return a[i];
    }

}
