import java.util.Scanner;
import java.math.BigInteger;
import java.math.*;

public class Solution{
    static void solve(int n, int[][] a){
       int leftsum=0;
       for(int i=0;i<n;i++) {
    	   for(int j=0;j<n;j++) {
    		   if(i==j) {
    			   leftsum=leftsum+a[i][j];
    		   }
    	   }
       }
       int rightsum=0;
       for(int i=0;i<n;i++) {
    	   for(int j=0;j<n;j++) {
    		   if(i+j==(n-1)) {
    			   rightsum=rightsum+a[i][j];
    		   }
    	   }
       }
       int result=Math.abs(leftsum-rightsum);
       System.out.println(result);
    }
}
