import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {

         int temp[] = new int[a.length];
            if(k == 0)
            {
                return a;
            }
            else{
                if(k > a.length)
                {
                    int rem = k%a.length;

                    if (rem != 0)
                        k = rem;
                }

                    for(int i =  a.length-k,j=0; i <= a.length-1; i++,j++)
                    {
                        temp[j] = a[i];

                    }

                    for(int l = 0, h = k ;l < a.length-k; l++,h++)
                    {
                        temp[h] = a[l];

                    }
             return temp;

            }

    }

}
