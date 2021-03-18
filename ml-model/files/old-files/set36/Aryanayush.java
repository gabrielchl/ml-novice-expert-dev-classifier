import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] a) {
        int n = a.length;
        int[] result = new int[a.length];
        int[] inverse = new int[a.length + 1];
        for (int i = 1; i <= n; i++) {
            inverse[a[i-1]] = i;
        }
        for (int i = 1; i <= n; i++) {
            result[i-1] = inverse[inverse[i]];
        }
        return result;
    }

}
