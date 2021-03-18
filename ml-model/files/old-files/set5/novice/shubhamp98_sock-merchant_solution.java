import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        int totalPairs = 0;
        int[] socksPairCount = new int[101];
        Arrays.fill(socksPairCount, 0);
        // 1 2 1 2 1 3 2
        for(int i = 0; i < n; i++) {
            int j = 1;
            while(j <= 100) {
                if(ar[i] == j) {
                    socksPairCount[j]++;
                    if(socksPairCount[j] == 2) {
                        totalPairs++;
                        socksPairCount[j] = 0;
                    }
                    break;
                }
                j++;
            }
        }
        return totalPairs;

    }
}
