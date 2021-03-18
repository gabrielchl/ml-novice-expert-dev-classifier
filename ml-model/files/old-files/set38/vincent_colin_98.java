import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int[] result = new int[p.length];
        for(int i = 1; i <= p.length; i++){
            result[i-1] = findIndex(findIndex(i, p), p);
        }
        return result;
    }

    static int findIndex(int value, int[] p){
        int i = 0;
        for(; i < p.length; i++){
            if(p[i] == value){
                return i+1;
            }
        }
        return -1;
    }

}
