import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {

        int n = p.length;
        int[] ar = new int[n+1];
        int[] res = new int[n];
        ar[0] = 0;
        int s =0 ;
        for(int i=1; i<=n; i++)
        {
            ar[i] = p[i-1];
        }

        for(int j=1; j<=n; j++)
        {
            for(int k=1; k<=n; k++)
            {
                if(ar[k]==j)
                {
                    for(int l=1; l<=n; l++)
                    {
                        if(ar[l]==k)
                        {
                            res[s] = l ;
                            s++;
                            break;
                        }
                    }
                }
            }
        }
        return res;




    }

}
