import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] circularArrayRotation(int[] a, int k, int[] queries)
    {
        int result[]=new int[queries.length];
        int ind=0,j=0;
        for (int i=0;i<queries.length;i++)
        {
            j=queries[i];
            ind=k%a.length;
            if(j-ind>=0)
                result[i]=j-ind;
            else
                result[i]=(j-ind)+a.length;
        }
        int answers[]=new int[result.length];
        for(int i=0;i<result.length;i++)
        {
            answers[i]=a[result[i]];
        }
        return answers;
    }

}
