import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

   
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int[] result = getRecord(s);
        String separator = "", delimiter = " ";
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        System.out.println("");
    }
    
    public static int[] getRecord(int[] s){
        int n = s.length;
        int l=s[0],h=s[0] ;
        int lc=0,hc=0;
        
        for(int j=1;j<n;j++){
            if(s[j] > h){
               h=s[j] ;
               hc++; 
            }else if(s[j] < l){
               l=s[j] ;
               lc++; 
            }    
        }
        
        return new int[]{hc,lc};
    }
}
