import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int[] answers = new int[p.length];

        // Values to Index
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<p.length;++i){
            map.put(Integer.valueOf(p[i]), Integer.valueOf(i+1));
        }

        for(int j=0;j<p.length;++j){
            answers[j] = map.get(map.get(j+1));
        }

        return answers;
    }

}
