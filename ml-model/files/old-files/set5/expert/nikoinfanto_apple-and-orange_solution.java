import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the countApplesAndOranges function below.
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {

// Complete this function
        int aHits = 0;
        int oHits = 0;
        for (int ap : apples) {
            if (hit(s, t, a, ap)) aHits++;
        }
        for (int or : oranges) {
            if (hit(s, t, b, or)) oHits++;
        }
        System.out.println(aHits);
        System.out.println(oHits);
    }

    private static boolean hit(int s, int t, int x, int y) {
        return ((x + y) >= s && (x + y) <= t);
    }
}
