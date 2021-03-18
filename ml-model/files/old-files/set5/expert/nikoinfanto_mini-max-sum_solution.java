import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        long min = 0;
        long max = 0;

        for(int i = 0; i < arr.length; i++)
        {
            long value = 0;

            for(int j = 0; j < arr.length; j++)
            {
                if(i == j)
                {

                }
                else
                {
                    value += arr[j];
                }
            } // end for loop

            if(i == 0)
            {
                min = value;
                max = value;
            }
            else
            {
                if(value > max)
                {
                    max = value;
                }
                if(value < min)
                {
                    min = value;
                }
            }

        }

        System.out.println(min + " " + max);

    }

}
