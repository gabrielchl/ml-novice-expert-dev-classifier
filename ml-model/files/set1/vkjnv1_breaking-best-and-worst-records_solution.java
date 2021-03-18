import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the breakingRecords function below.
    public static void main(String args[]){
        int n;
        int c1=0, c2=0;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int a[]=new int[n];
        for(int i=0; i<n; i++){
            a[i]=s.nextInt();
        }
        for(int i=0; i<n; i++){
            if(a[i]>max){
                max=a[i];
                c1++;
            }
        }
        for(int i=0; i<n; i++){
            if(a[i]<min){
                min=a[i];
                c2++;
            }
        }
        System.out.print(c1-1);
        System.out.print(" ");
        System.out.print(c2-1);
    }
}
