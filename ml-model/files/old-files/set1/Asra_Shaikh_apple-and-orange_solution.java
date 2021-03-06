import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        
        int aCount=0;
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
            int apos = a + apple[apple_i];
            if(apos >=s && apos<=t){
                aCount++;   
            }
        }
        
        int bCount=0;
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
            int opos = b + orange[orange_i];
            if(opos >=s && opos<=t){
                bCount++;   
            }
        }
        
        System.out.println(aCount);
        System.out.println(bCount);
    }
}
