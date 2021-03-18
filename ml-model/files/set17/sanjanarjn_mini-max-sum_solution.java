import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static void solve(int[] arr)
    {
        long totalSum = 0;
        int size = arr.length;
        for(int i=0; i<size; i++)
        {
            totalSum += arr[i];
        }

        long miniSum = totalSum, maxSum = 0;
        for(int i=0; i<size; i++)
        {
            int element = arr[i];

            if(totalSum - element < miniSum)
                miniSum = totalSum - element;

            if(totalSum - element > maxSum)
                maxSum = totalSum - element;
        }
        System.out.println(miniSum+" "+maxSum);
    }

}
