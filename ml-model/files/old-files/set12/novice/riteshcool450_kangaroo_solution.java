import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
public static void main(String [] args)
{
    Scanner sc=new Scanner(System.in);
    int x1=sc.nextInt();
    int v1=sc.nextInt();
    int x2=sc.nextInt();
    int v2=sc.nextInt();
    int k1=x1;
    int k2=x2;
    int i ,c=0;
    if(x1<x2 && v1<v2)
    {
        System.out.println("NO");
    }
    else
    {
        for(i=0;i<1000000;i++)
        {
            k1=k1+v1;
            k2=k2+v2;
            if(k1==k2)
            {
                c++;
                break;
            }
        }
    }
    if(c!=0)
    {
     System.out.println("YES");   
    }
    else
    {
        System.out.println("NO");
    }
    
}
}