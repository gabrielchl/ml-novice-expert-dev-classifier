import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the birthdayCakeCandles function below.
    static int birthdayCakeCandles(int[] ar)
    {
        int tallest = 0;
        int size = ar.length;

        for(int i=0;i<size;i++)
        {
            if(ar[i] > tallest)
                tallest = ar[i];
        }

        int tallestCount = 0;
        for(int i=0;i<size;i++)
        {
            if(ar[i] == tallest)
                tallestCount++;
        }
        return tallestCount;


    }

}
