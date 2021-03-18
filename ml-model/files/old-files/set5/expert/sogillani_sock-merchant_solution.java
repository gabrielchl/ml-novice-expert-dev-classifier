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
        Map<Integer, Integer> map = new HashMap<>();

        int count = 0;
        for (int i : ar) {
            Integer f = map.get(i);
            if (f != null) {
                count++;
                map.remove(i);
                continue;
            }

            map.put(i, i);
        }

        return count;
    }

}
