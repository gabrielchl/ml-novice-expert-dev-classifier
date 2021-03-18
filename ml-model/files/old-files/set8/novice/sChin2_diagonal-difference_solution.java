import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int s=0,r=0,t=n-1;
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j)
                    s+=a[i][j];
            }
        }
        
        
        for(int i=0;i<n;i++)
        {
            r+=a[i][t];
            t--;
        }
        
        if(r<s)
            System.out.println(s-r);
        else
            System.out.println(r-s);         
    }
}
