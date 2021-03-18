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
        int countApples = 0;
        int countOranges = 0;

        for (int i = 0; i < apples.length; i++) {
            if (((apples[i] + a) >= s) && ((apples[i] + a) <= t))
                countApples++;
        }

        System.out.println(countApples);

        for (int i = 0; i < oranges.length; i++) {
            if (((oranges[i] + b) >= s) && ((oranges[i] + b) <= t))
                countOranges++;
        }

        System.out.println(countOranges);

    }

}
