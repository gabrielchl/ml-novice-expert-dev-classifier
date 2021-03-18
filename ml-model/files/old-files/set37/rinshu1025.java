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

     
        public static void main(String[] args) {
             Scanner scanner = new Scanner(System.in);

            int n = scanner.nextInt();
          
            int[] p = new int[n];

          
            for (int i = 0; i < n; i++) {
                
                p[i] = scanner.nextInt();
            }

            int[] result = permutationEquation(p);

            for (int i = 0; i < result.length; i++) {
               System.out.println(result[i]);
            }

            scanner.close();
        }
    }
