import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

   static int[] permutationEquation(int[] p) {
        final Map<Integer, Integer> pointMap = new HashMap<>(p.length);
        int[] result = new int[p.length];
        for (int x = 1; x <= p.length; x++) {
            pointMap.put(p[x - 1], x);
        }
        int index = 0;
        for(int x = 1; x <= p.length; x++){
            result[index++] = pointMap.get(pointMap.get(x));
        }
        return result;
    }

}
