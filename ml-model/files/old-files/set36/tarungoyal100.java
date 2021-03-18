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
        int[] arr=new int[p.length];
        for(int x=1;x<=p.length;x++)
        {
            int index=0;
            for(int y:p)
            {
                index++;
                if(y==x)
                {
                    break;
                }

            }
            int z=index;
            index=0;
            for(int y:p)
            {
                index++;
                if(z==y)
                {
                    break;
                }

            }
            arr[x-1]=index;
        }
        return arr;
    }

}
