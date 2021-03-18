import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
      int x=p.length;
        int b=0,c=0;
        int[] newr=new int[x+1];
        int[]count=new int[x];
        count[0]=0;
        for(int i=1;i<=x;i++)
        {
            newr[0]=0;
            newr[i]=p[i-1];
        }
        for(int i=1;i<=x;i++)
        {
            for(int j=1;j<=x;j++)
            {
                if(i==newr[j])
                  b=j;
            }
           for(int f=1;f<=x;f++)
           {
               if(b==newr[f])
                  count[i-1]=f;
           }
        }
        return count;
    }

}
