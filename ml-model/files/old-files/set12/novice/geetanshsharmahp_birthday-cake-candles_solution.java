import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class a
{
public static void main(String s[])
{
int max=0,count=0;

Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(int i=1;i<n;i++)
{
if(a[i]>max)
{
    max=a[i];
}
}
for(int i=0;i<n;i++)
{
if(a[i]==max){count++;}
}

//System.out.println("The max elemnt is"+max);
System.out.println(count);
}


}
