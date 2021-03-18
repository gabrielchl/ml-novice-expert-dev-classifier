import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int[] res=new int[p.length];
        for(int i=1;i<=p.length;i++)
        {
            for(int j=0;j<p.length;j++)
            {
                if(p[j]==i)
                {
                    for(int k=0;k<p.length;k++)
                    {
                        if(p[k]==(j+1))
                        res[i-1]=k+1;
                    }
                }
            }
        }
        return res;
    }

}
