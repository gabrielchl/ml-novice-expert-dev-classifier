import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       int n,i,j,c=0,d=0,k,sum;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        k=n-1;
        int[][] a=new int[n][n];
        for(i=0;i<n;i++)
            {
            for(j=0;j<n;j++)
                {
                a[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<n;i++)
            {
            c+=a[i][i];
            d+=a[i][k];
            k--;
        }
        sum=c-d;
        System.out.println(Math.abs(sum));
    }
}
