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

        int retVal = 0;
        if (ar.length ==0) return retVal;
        if(ar.length > 0)
        {
            Arrays.sort(ar);
            int maxHeight = ar[ar.length -1];
            retVal =1;
            for (int i = ar.length -2; i > 0;i--)
            {
                if (ar[i] == maxHeight)
                    retVal++;
            }
        }
        return retVal;
    }
}
