import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int solve(int n, int[] ar) {
        // this array is to count the number of appearance of element in ar
        int result = 0;
        final int ARRAY_LENGTH = 101;
        int[] cntArr = new int[ARRAY_LENGTH];
        for (int i = 0; i < n; i++) {
            cntArr[ar[i]]++;
        }
        for (int i = 1; i < ARRAY_LENGTH; i++) {
            result += (cntArr[i]/2);
        }
        return result;
    }

}
