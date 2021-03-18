import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int len=p.length;
        int ans[]=new int[len];

        HashMap<Integer, Integer> idx= new HashMap<>();

        for(int a=0;a<len;a++){
            idx.put(p[a], a+1);
        }

        for(int a=1;a<=len;a++){
            ans[a-1]= idx.get(idx.get(a));
        }
        return ans;
    }

}
