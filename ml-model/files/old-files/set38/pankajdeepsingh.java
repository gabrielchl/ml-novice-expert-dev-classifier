import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

   static int[] permutationEquation(int[] p) {

        int[] output = new int[p.length];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < p.length; i++) {
            map.put(p[i] , i+1);
        }
        for (int i = 1; i <= p.length; i++) {
            int y = map.get(map.get(i));
            output[i-1] = y;
        }
        return output;
    }
}
