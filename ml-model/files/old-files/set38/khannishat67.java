import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(Integer[] p) {
        List<Integer> list = Arrays.asList(p);
        int[] arr = new int[p.length];

        for(int i=0;i<p.length;i++){
            int index = list.indexOf(i+1);
            int index2 = list.indexOf(index+1);
            arr[i] = index2+1;
        }
        return arr;
    }

}
