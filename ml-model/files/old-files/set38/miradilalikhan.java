import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int[] out = new int[p.length];
        int i=1;
        while(i<=p.length){
            int o=indexOf(p,i)+1;
            out[i-1]= indexOf(p,o)+1;
            i++;
        }
return out;

    }
 public static int indexOf(int[] k, int n){
     for(int i=0; i<k.length; i++){
         if(n==k[i])return i;
     }
     return -1;
 }
}
