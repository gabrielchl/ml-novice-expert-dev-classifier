import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int f[]=new int[p.length];
        int arr[]=new int[p.length];
        int i=1;
        int m,j;
        while(i<p.length)
        {
            f[i]=p[p[i]];
            i++;
        }
        i=1;
        while(i<p.length)
        {
             m=i; j=1;
            while(j<p.length)
            {
                if(m==f[j])
                {
                    arr[i]=j;
                    break;
                }
                else
                    j++;
            }
            i++;
        }
         /*i=1;
        while(i<p.length)
        {
           System.out.print(arr[i]);
        i++;
        }*/
        return arr;

    }

}
