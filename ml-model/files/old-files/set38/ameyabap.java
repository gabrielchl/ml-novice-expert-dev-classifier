import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        Map<Integer, Integer> valueToIndex = new HashMap<Integer, Integer>();
        for(int i =0;i<p.length;i++) {
            valueToIndex.put(p[i], i+1);
        }
        int[] result = new int[p.length];
        for(int i = 0;i<p.length;i++) {
            result[i] = valueToIndex.get(valueToIndex.get(i+1));
        }
        return result;
    }

}
