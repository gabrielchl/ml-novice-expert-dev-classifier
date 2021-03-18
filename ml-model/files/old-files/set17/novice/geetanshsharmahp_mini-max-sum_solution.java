import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class Solution
{
    static void solve(int[] a)
    {
 long num1=0,num2=0,num3=0,num4=0,num5=0;
for(int i=0;i<5;i++)
{
if(i==0)
{
num1=a[1]+a[2]+a[3]+a[4];
}
if(i==1)
{
num2=a[0]+a[2]+a[3]+a[4];
}
if(i==2)
{
num3=a[0]+a[1]+a[3]+a[4];
}
if(i==3)
{
num4=a[0]+a[1]+a[2]+a[4];
}
if(i==4)
{
num5=a[0]+a[1]+a[2]+a[3];
}

}
//System.out.println(""+num1);
//System.out.println(""+num2);
//System.out.println(""+num3);
//System.out.println(""+num4);
//System.out.println(""+num5);
long arr[]={num1,num2,num3,num4,num5};
long small=arr[0];long largest=arr[0];
for(int i=1;i<arr.length;i++)
{
if(arr[i]>largest)
{
largest=arr[i];
}
}
for(int i=1;i<arr.length;i++)
{
if(arr[i]<small)
{
small=arr[i];
}
}
System.out.print(""+small+" ");
System.out.print(""+largest);
}
}
