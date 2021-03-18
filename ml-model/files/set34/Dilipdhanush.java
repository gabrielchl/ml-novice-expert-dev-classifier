import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int b[] = new int[a.length], c[] = new int[queries.length];
        int i;
        for(i = 0;i < a.length;i++)
                b[(i + (k % (a.length))) % a.length] = a[i];
        for(i = 0;i < queries.length; i++)
                c[i] = b[queries[i]];
        return c;
    }

}
