import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) throws IOException {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] ar=new int[n];
    int i=0,j;
    for(i=0;i<n;i++)
    {
         ar[i]=sc.nextInt();
    }
    int max=0;
    i=0;
    while(i<n){
        int c=0;
    for(j=0;j<n;j++){
        if((ar[i]==ar[j]+1)||ar[j]==ar[i])
        c++;
    }
    if(c>max)
    max=c;
    i++;
    }
    System.out.println(max);
    }
}
