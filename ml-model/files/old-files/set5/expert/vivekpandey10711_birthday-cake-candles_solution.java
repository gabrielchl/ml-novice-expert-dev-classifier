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
        int n = ar.length;
        int increse = 0;
        Arrays.sort(ar);
        for(int i = 0; i<n; i++){
          if(ar[n-1]== ar[n-i-1]){
            increse++;
          } else{
              break;
          }
        }
         return increse;
    }

}
