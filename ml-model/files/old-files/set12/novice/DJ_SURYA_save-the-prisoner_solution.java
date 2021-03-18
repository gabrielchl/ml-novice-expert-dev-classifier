import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        int end=0;
        for(int i=0;i<t;i++){
            int n=scan.nextInt();
            int m=scan.nextInt();
            int s=scan.nextInt();
            int[] p=new int[n];
            for(int k=0;k<n;k++){
                p[k]=k+1;
            }
            for(int j=0;j<m;j++){
                end=p[s-1];
                s=s+1;
                if(s==n+1){
                    s=1;
                }
            }
            System.out.println(end);
        }
    }
}
