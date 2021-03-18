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
        long max=arr[0],min=arr[0],sum=arr[0];
        for(int i=1;i<5;i++)
        {
            sum+=arr[i];
            if(arr[i]<min)
                min=arr[i];
            if(arr[i]>max)
                max=arr[i];
        }
        System.out.println((sum-max)+" "+(sum-min));


    }

}
