import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        // 123 -> 312 -> 231
        int arrSize = a.length;
        int[] rtArr = new int[queries.length];
        while( k >= 1) {
            for(int i = 0; i < arrSize; i++) {
                if(i + k < arrSize)
                    rtArr[i] = a[i+k]; // 231
                else
                    rtArr[i] = a[0];
            }
            k--;
        }
        return rtArr;
    }

}
