import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
         HashMap<Integer,Integer> s = new HashMap<>();
         int m [] = new int[p.length];
         for(int i = 1; i <= p.length; i++) {
             s.put(p[i - 1], i);
         }
         int i = 0;
         for(Map.Entry<Integer, Integer> l: s.entrySet()) {
             m[i++] = s.get(l.getValue());
         }
        return m;
    }

}
