import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        Vector<Integer> vint = new Vector();
        for(int aa : a){
            vint.add(aa);
        }
        for(int i = 0; i < k; i++){
            vint.add(0, vint.get(vint.size()-1));
            vint.remove(vint.size()-1);
        }
        int[] result = new int[queries.length];
        int idx = 0;
        for(int query : queries){
            result[idx] = vint.get(query);
            idx++;
        }
        return result;
    }

}
