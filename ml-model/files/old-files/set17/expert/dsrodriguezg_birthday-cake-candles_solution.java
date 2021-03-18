import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int solve(int n, int[] ar) {

        int candles = 0;

        Arrays.sort(ar);

        for(int i = 0; i<n; i++){

            if(ar[i]==ar[n-1]){
                candles++;
            }
        }

        return candles;
    }

}
