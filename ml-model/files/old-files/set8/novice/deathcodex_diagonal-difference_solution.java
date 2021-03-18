import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        int d1=0;int d2=0;
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
            d1=d1+a[a_i][a_i];
            d2=d2+a[a_i][n-a_i-1];
            }
        
        if(d1-d2>0)
       System.out.println(d1-d2);
        if(d1-d2<0)
       System.out.println(d2-d1);
        if(d1-d2==0)
       System.out.println("0");
        
    }
}
