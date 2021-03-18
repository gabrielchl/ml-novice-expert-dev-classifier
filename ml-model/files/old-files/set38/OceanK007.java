import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p)
    {
        int[] result = new int[p.length];
        int index = 0;
        int index2 = 0;
        for(int i=1;i<=p.length;i++)
        {
            index = findIndex(p, i)+1;
            index2 = findIndex(p, index)+1;
            result[i-1]=index2;
        }

        return result;
    }

    static int findIndex(int[] p, int element)
    {
        int index=0;
        for(int i=0;i<p.length;i++)
        {
            if(p[i]==element)
            {
                index = i;
                break;
            }
        }
        return index;
    }

}
