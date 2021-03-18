import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {

        List<Integer> a1 = new ArrayList<>();
        for(int i=0;i<a.length;i++) {
            a1.add(a[i]);
        }
        if(k > a1.size()) {
            k = k%a1.size();
        }

        for(int i=0;i<k;i++) {
            Integer element = a1.remove(a1.size()-1);
            a1.add(0, element);
        }

        int res[] = new int[queries.length];

        for(int i=0;i<queries.length;i++) {
            res[i] = a1.get(queries[i]);
        }

        return res;
    }

}
