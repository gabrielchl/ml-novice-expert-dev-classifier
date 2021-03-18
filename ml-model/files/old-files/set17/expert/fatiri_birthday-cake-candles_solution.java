import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int solve(int[] ar) {
    int i =0;
    int totalCandles = 0;
    int height =0;
    for(i=0; i<ar.length; i++){
        if(height<ar[i]){
            height = ar[i];
        }

    }
    for(i=0; i<ar.length; i++){
           if(height==ar[i]){
            totalCandles++;
           }
       }
    return totalCandles;
    }

}
