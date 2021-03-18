import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int y[]=new int[p.length];
        int s = p.length,o=0;
        for(int i=1;i<=s;i++){
            int k=0;
            for(int j=0;j<s;j++){
                if(i==p[j]){
                    k=j+1;
                    break;
                }
            }
            for(int j=0;j<s;j++){
                if(k==p[j]){
                    y[o]=j+1;
                    o++;
                }
            }
        }
        return y;
    }

}
