import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static void solve(int[] arr) {
        int maxValue = arr[0];
        int minValue = arr[0];
        long sum = arr[0];

        for(int i = 1; i < arr.length; i++){

            sum += arr[i];
            if(arr[i] > maxValue){
                maxValue = arr[i];
            }
            if(arr[i] < minValue){
                minValue = arr[i];
            }

        }

        System.out.println((sum - maxValue)+" "+(sum - minValue));


    }

}
