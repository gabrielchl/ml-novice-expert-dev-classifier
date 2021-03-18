import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */

    public static int birthdayCakeCandles(List<Integer> candles) {

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
