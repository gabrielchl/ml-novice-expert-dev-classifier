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
        long sum=0,min=999999999,max=0;
        for(int i=0;i<5;i++)
        {
            sum=sum+arr[i];
            if(arr[i]>=max)
                max=arr[i];
            if(arr[i]<=min)
                min=arr[i];

        }
        System.out.println((sum-max)+" "+(sum-min));

    }
