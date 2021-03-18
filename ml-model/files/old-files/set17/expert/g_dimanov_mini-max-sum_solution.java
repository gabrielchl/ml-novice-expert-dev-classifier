import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static void solve(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        long sum = 0;

        for (int value : arr) {
            if (value < min) {
                min = value;
            }
            if (value > max) {
                max = value;
            }
            sum += value;
        }

        System.out.printf("%d %d", sum - max, sum - min);
    }

}
