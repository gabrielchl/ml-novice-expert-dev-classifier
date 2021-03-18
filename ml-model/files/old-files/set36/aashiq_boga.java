import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        if(p==null || p.length<1) return p;

        int[] res = new int[p.length];

        Map<Integer, Integer> valIdx = new HashMap<>();

        for(int i=0; i<p.length; i++){
            valIdx.put(p[i], i+1);
        }

        for(int i=1; i<=p.length; i++){
            res[i-1] = valIdx.get(valIdx.get(i));
        }

        return res;

    }

}
