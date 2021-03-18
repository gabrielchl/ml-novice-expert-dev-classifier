import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int arr[]=new int[p.length];
        for(int i=0;i<p.length;i++)
        {
            arr[i]=p[i];
        }
        Arrays.sort(arr);
        int arrnk[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<p.length;j++)
            {
                if(arr[i]==p[j])
                {
                    arrnk[i]=j+1;
                }
            }
        }
        int arrpk[]=new int[arr.length];
        for(int i=0;i<arrnk.length;i++)
        {
            for(int j=0;j<p.length;j++)
            {
                if(arrnk[i]==p[j])
                {
                    arrpk[i]=j+1;
                }
            }
        }

    return arrpk;
    }

}
