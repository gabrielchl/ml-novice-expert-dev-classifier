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
        Set<Integer> result = new HashSet<>();
        int pairs = 0;

        for(int i=0; i<n; i ++){
            if(!result.contains(ar[i])){
                result.add(ar[i]);
            } else {
                pairs ++;
                result.remove(ar[i]);
            }
        }

        return pairs;



    }
}
