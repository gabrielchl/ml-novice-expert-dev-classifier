import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
    int b[]=new int[p.length],x=1;
    while(x<=p.length){
    for(int i=0;i<p.length;i++){
        if(p[i]==x){
         for(int j=0;j<p.length;j++){
             if(p[j]==i+1){
              b[x-1]=j+1;
             }
         }x++;
        }
    }}
    return b;
    }

}
