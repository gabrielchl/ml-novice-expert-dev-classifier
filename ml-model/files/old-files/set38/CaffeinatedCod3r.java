import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int[] y = new int[p.length];
        for(int i=0;i<p.length;i++){
            int val=p[i];
            int index=i+1;
            for(int j=0;j<p.length;j++){
                if(p[j]==index){
                    y[val-1]=j+1;
                }
            }
        }
        return y;
    }

}
