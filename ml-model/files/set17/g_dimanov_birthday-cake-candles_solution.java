import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static int solve(List<Integer> candles) {

        int candlesCount = 0;
        int maxCandle = 0;
        for(Integer candle : candles) {
            if (candle > maxCandle) {
                maxCandle = candle;
                candlesCount = 1;
            } else if (candle == maxCandle) {
                candlesCount++;
            }
        }

        return candlesCount;

    }

}
