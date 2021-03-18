import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        //create a hashmap
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<p.length;i++) {
            map.put(p[i],i+1);
        }
        //create a array to store data
        int[] arr = new int[p.length];
        // for all value get the data
        for(int i=0;i<p.length;i++) {
            arr[i] = map.get(map.get(i+1));
        }
        return arr;
    }

}
