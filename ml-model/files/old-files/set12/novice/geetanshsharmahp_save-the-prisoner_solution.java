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
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=0;i<n;i++)
{
int p=sc.nextInt();
int m=sc.nextInt();
int id=sc.nextInt();
if((m+id-1)%p==0)
System.out.println(p);
    else
System.out.println((m+id-1)%p);
}
}
}
