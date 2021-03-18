import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int[] result=new int[p.length];
        Map<Integer,Integer> value_index=new TreeMap<>();
        for(int index=0;index<p.length;index++) {
            value_index.put(p[index],(index+1));
        }
        for(int num=1;num<=p.length;num++) {
            result[num-1]=value_index.get(value_index.get(num));
        }
        return result;
    }

}
