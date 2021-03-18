import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int rot = k % a.length;
        int dup[] = new int[a.length+1];

        // System.out.println("k: " + k);
        // System.out.println("a.length: " + a.length + " rot: " + rot);
        for(int i = 0; i < a.length; i++) {
            dup[i] = a[(a.length - rot + i) % a.length];
            // System.out.println("dup: " + i + " " + dup[i]);
        }

        for(int i = 0; i < queries.length; i++) {
            queries[i] = dup[queries[i]];
        }

        return queries;

    }

}
