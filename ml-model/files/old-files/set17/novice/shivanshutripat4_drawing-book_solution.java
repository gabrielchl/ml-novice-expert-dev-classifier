import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    static int solve(int n, int p) {
       int s=0;
       int e=0;
       if(n==p)
       {
           s=0;
           e=0;
       }
       else
       {
     if(n%2==0)
     {
if(p%2==0)
{
    s=p/2;
    e=(n-p)/2;

}
else
{
    s=(p-1)/2;
    e=(n-(p-1))/2;
}}
else
{
    if(p%2==0)
    {
      s=p/2;
      e=(n-1-p)/2;
    }
    else
    {
        s=(p-1)/2;
        e=(n-1-p-1)/2;
    }
}}

     int res=Math.min(s,e);
     return res;
    }

}
