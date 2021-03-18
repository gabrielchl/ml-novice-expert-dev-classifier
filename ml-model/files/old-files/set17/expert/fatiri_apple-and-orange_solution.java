import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static void solve(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int count = 0;
        for (int i = 0; i < apples.length; i++) {
            int applesPos = apples[i] + a;
            if ((applesPos >= s) && (applesPos <= t)) {
                count++;
            }
        }
        System.out.println(count);
         count = 0;
        for (int i = 0; i < oranges.length; i++) {
            int orangesPos = oranges[i] + b;
            if ((orangesPos >= s) && (orangesPos <= t)) {
                count++;
            }
        }

        System.out.println(count);
    }

}
