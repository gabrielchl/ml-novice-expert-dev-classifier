import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {


    static int find(int[] p, int x){
            for(int i=0; i<p.length; i++){
                if(p[i]==x){
                    return i+1;
                }
            }
            return -1;
    }
    static int[] permutationEquation(int[] p) {
        int[] solset1 = new int[p.length];
        int[] solset2 = new int[p.length];
        for(int i= 0; i<p.length; i++){
            solset1[i] = find(p,i+1);
            solset2[i] = find(p, solset1[i]);
        }
        return solset2;
    }

}
