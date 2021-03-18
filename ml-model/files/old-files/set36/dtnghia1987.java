import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        Map <Integer, Integer> m = new HashMap<Integer, Integer>();
        for (int i = 0; i < p.length; i++){
            m.put(p[i], i + 1);
        }
        int[] result = new int[p.length];
        for (int i = 1; i <= p.length; i++){
            int value = m.get(i);
            int ans = m.get(value);
            result[i - 1] = ans;
        }
        return result;
    }

}
