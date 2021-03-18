import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int n = p.length;
        int ar[] = new int[n];
        for(int i=1;i<=n;i++){
            for(int j=0;j<n;j++){
                if(p[p[j]-1] == i){
                    ar[i-1] = j+1;
                    break;
                }
            }
        }
        return ar;
    }

}
