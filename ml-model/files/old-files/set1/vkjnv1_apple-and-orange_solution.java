import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the countApplesAndOranges function below.
 public static void main(String args[]){
     int s, t,m, n, a, b;
     int c1=0,c2=0;
     Scanner sc=new Scanner(System.in);
     s=sc.nextInt();
     t=sc.nextInt();
     
     a =sc.nextInt();
     b=sc.nextInt();
     m=sc.nextInt();
     n=sc.nextInt();
     int x[]=new int[m+1];
     int y[]=new int[n+1];
     for(int i=1; i<=m; i++){
         x[i]=sc.nextInt();
     } 
     for(int i=1; i<=n; i++){
             y[i]=sc.nextInt();
         }
     for(int i=1; i<=m; i++){
         if((a + x[i])>=s && (a+x[i])<=t){
             c1++;
     } 
     }
     for(int i=1; i<=n; i++){ 
             if( (b+y[i])>=s && (b+y[i])<=t){
                 c2++;
             }
         }
     System.out.println(c1);
     System.out.println(c2);
 }
}
