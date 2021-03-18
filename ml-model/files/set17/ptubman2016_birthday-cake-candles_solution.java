import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static int solve(List<Integer> candles) {

        int topHeight = 0;
        int numHighCandles = 0;

        for(int i = 0; i < candles.size(); i++){

            if(candles.get(i) > topHeight){
                topHeight = candles.get(i);
            }
        }

        for(int j = 0; j < candles.size(); j++){

            if(candles.get(j) == topHeight){
                numHighCandles++;
            }
        }

        return numHighCandles;

    }

}
