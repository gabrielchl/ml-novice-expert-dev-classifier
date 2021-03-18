import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution 
{
    public static void main(String s[])
    {
        int temp;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int count =0;
        int l=a.length;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
if(a[i]>a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
         for(int i=0;i<n-1;i++)
         {
             if(a[i]==a[i+1])
             {
                 count++;
                 i=i+1;
             }
         }
        System.out.println(""+count);
    }
}


 
