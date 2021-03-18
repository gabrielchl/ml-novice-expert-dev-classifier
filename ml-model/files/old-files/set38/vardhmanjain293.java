import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int arr[]=new int[p.length];int t=0;
        for(int x=1;x<=p.length;x++)
        {
            for(int y=1;y<=p.length;y++)
            {
                if(p[y-1]==x)
                {
                    for(int j=1;j<=p.length;j++)
                    {
                        if(p[j-1]==y){arr[t]=j;t++;break;}
                    }
                }
            }
        }
        return arr;

    }

}
