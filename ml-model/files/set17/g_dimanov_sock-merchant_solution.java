import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int solve(int n, int[] ar) {

        Map<Integer, Integer> socksMap = new TreeMap<>();
        for(int i =0; i < ar.length; i++) {
            if(!socksMap.containsKey(ar[i])) {
                socksMap.put(ar[i], 1);
            } else {
                socksMap.put(ar[i], socksMap.get(ar[i]) + 1);
            }
        }
        int pairCount = 0;
        for(Map.Entry<Integer, Integer> entry : socksMap.entrySet()) {
            pairCount += Math.floor(entry.getValue()) / 2;
        }

        return pairCount;
    }

}
