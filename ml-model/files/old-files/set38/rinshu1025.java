import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

     static int[] permutationEquation(int[] p) {
            int n=p.length;
            int b[]=new int[n+1];
            int result[]=new int[n];
            for(int i=0;i<n;i++){
                b[p[i]]=i+1;
            }

            for(int i=1 ;i<n+1;i++){
                for(int j=0;j<n;j++){
                    if(b[i]==p[j]){
                        result[i-1]=j+1;
                        break;
                    }
                    else{
                        continue;
                    }
                }
            }
            return result;
        }


    }
