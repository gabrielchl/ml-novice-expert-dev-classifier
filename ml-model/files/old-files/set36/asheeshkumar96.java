import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int[] permutations =  new int[p.length];
        for(int i = 0; i < p.length; i++) {
            int tempIndex = getIndex(p, i+1);
            int index = getIndex(p, tempIndex + 1);
            System.out.println("n = " + (i + 1) + " tempIndex="+tempIndex + " index =" + index);
            permutations[i] = index + 1;
        }
        return permutations;
    }

    static int getIndex(int[] p, int value) {
        int index = -1;
        for(int i = 0; i < p.length; i++) {
            if(p[i] == value) {
                index = i;
                break;
            }
        }
        return index;
    }

}
