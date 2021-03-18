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
int appleCount = 0;
        int orangeCount = 0;
        for (int apple : apples) {
            appleCount = (a + apple >= s && a + apple <= t) ? appleCount + 1 : appleCount;
        }
        for (int orange : oranges) {
            orangeCount = (b + orange >= s && b + orange <= t) ? orangeCount + 1 : orangeCount;
        }
        System.out.println(appleCount);
        System.out.println(orangeCount);
    }
}
