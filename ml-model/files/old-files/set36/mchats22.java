import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int []q) {
        int a[] = new int[q.length];
        for(int i=1;i<=q.length;i++){
            for(int j=0;j<q.length;j++){
                if(i==q[j]){
                    System.out.println("j:" +j);
                    j=j+1;
                    for(int k=0;k<q.length; k++){
                             if(q[k]==j)
                                 a[i-1]=k+1;
                    }
                }
            }
        }
        return a;
    }

}
