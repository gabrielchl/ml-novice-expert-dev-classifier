import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution
{
    public static void main(String s[])
    {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++)
    {
        if(a[i]>=38&& a[i]%5 >2)
        {
            a[i]=a[i]+(5-a[i]%5);
        }
            System.out.println(a[i]);
        }
    }
}
