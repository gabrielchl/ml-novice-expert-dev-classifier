import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int solve(int n, int[] ar) {

        int max = 0;
        int overallPairs = 0;

        for(int i = 0; i < n; i++){
            if (ar[i] > max){
                max= ar[i];
            }
        }

        for(int j = 1; j <= max; j++){
            int numSocks = 0;
            for(int k = 0; k < ar.length;k++){
                if(ar[k] == j){
                    numSocks++;
                }
            }

            overallPairs += (numSocks/2);

        }

        return overallPairs;
    }

}
