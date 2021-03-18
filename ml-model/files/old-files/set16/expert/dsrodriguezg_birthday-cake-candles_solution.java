import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int birthdayCakeCandles(int n, int[] ar) {
        
        int candles = 0;
        
        Arrays.sort(ar);
        
        for(int i = 0; i<n; i++){
            
            if(ar[i]==ar[n-1]){
                candles++;
            }
        }
        
        return candles;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
