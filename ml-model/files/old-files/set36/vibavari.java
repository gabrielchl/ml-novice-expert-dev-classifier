import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int n=p.length;
        int[] result = new int[n];
        int x=1,y, flag=0;

        for(int i=0;i<n;i++)
        {
            if(p[i]==x)
            {
                flag=0;
                for(int j=0;j<n;j++)
                {
                    if(p[j]==i+1)
                    {
                        y=j+1;
                        result[x-1]=y;
                        flag=1;
                        x++;
                        break;
                    }
                }
            }
            if(flag==1){
                i=-1;
                flag=0;
            }
            if(x==n+1 && result[x-2]!=0){
                break;
            }
        }
        return result;



    }

}
