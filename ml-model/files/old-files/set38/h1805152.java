import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int LinearSearch(int arr[], int x)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(x==arr[i])
                return i;
        }

        return -1;
    }
    static int[] permutationEquation(int[] p)
    {
        int ans[]=new int[(p.length)];
        int y=0,k=0,l=0;
        for(int i=0;i<p.length;i++)
        {
            y=p[i];
            if((i+1)==(p[p[y-1]-1]))
                ans[i]=y;
            else
            {
                k=LinearSearch(p,(i+1));
                l=LinearSearch(p,(k+1));
                ans[i]=l+1;
            }
        }
        return ans;


    }

}
