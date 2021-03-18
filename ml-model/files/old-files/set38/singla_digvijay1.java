import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        Map<Integer,Integer> valuesToIndex = new HashMap<>();
        Map<Integer,Integer> indexToValue = new HashMap<>();
        for (int i = 0; i < p.length; i++) {
            valuesToIndex.put(p[i],i);
            indexToValue.put(i,p[i]);
        }
        int[] fina = new int[p.length];
         for (int i = 1; i <= p.length; i++) {
             fina[i-1] = valuesToIndex.get(valuesToIndex.get(i)+1)+1;
         }
         return fina;
    }

}
