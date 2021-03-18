import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the birthdayCakeCandles function below.
    static int birthdayCakeCandles(int[] ar) {
        int max = getMax(ar);
        int c = 0;

        for(int i = 0; i < ar.length; i++)
        {
            if (ar[i] == max)
            {
                c++;
            }
        }

        return c;

    }

// Method for getting the maximum value
  public static int getMax(int[] inputArray){
    int maxValue = inputArray[0];
    for(int i=1;i < inputArray.length;i++){
      if(inputArray[i] > maxValue){
         maxValue = inputArray[i];
      }
    }
    return maxValue;
  }
}
