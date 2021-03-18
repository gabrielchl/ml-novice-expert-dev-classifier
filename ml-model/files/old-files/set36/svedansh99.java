import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int[] y=new int[p.length]; int pos=0;

for(int i=0;i<p.length;i++)
{for(int j=0;j<p.length;j++)
{
    if(i+1==p[j])
    {
       pos= j+1;break;

    }

}

 for(int j=0;j<p.length;j++)
 {

     if(p[j]==pos)
     {
         pos=j;break;
     }}
     y[p[pos]-1]=i+1;

}
return(y);
    }

}
