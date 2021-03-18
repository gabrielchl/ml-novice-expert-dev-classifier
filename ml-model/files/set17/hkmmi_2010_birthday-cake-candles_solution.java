import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static int solve(List<Integer> candles) {
    // Write your code here
int maxNum = candles.get(0);
        for (int i = 0; i < candles.size(); i++) {

            if (maxNum < candles.get(i)) {
                maxNum = candles.get(i);

            }

        }

        int sol = 0;
        for (int i = 0; i < candles.size(); i++) {
            int current = candles.get(i);

            if (current == maxNum) {
                sol++;
            }
        }

        return sol;
    }

}
