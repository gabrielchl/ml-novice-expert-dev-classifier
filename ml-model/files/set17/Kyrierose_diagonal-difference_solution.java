import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void solve(int n, int[][] a) {
        int sum1=0,sum2=0;
        int [][]b=new int[n][n];
        for(int i=0;i<n;i++)
        	for(int j=0;j<n;j++)
        		if(i==j) sum1+=a[i][j];
        int fl=n-1;
        for(int i=0;i<n;i++)
        	for(int j=n-1;j>=0;j--)
        		if(j==fl){
        			sum2+=a[i][j];
        			fl--;
        			i++;
        		}
        int out=sum1-sum2;
        if(out<0)out*=-1;
        System.out.println(out);
    }
}
