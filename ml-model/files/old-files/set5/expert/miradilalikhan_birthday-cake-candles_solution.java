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
        Arrays.sort(ar);
        int count =1;
        for(int i=ar.length-1; i>=1; i--){
            if(ar[i]==ar[i-1])count++;
            else break;
        }
        return count;
    }

}
