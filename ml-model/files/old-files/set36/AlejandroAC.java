import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int[] a = new int[p.length];

        for (int i = 1; i<=p.length; i++){
            int k = p[i-1];
            int l = p[k-1];
            a[l-1] = i;
        }

        return a;

    }

}
